package com.example.pchub.Fragment

import android.app.Activity
import android.content.Intent
import android.net.Uri
import com.example.pchub.data.AppDatabase
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ImageView
import com.example.pchub.R
import android.widget.Button
import android.widget.Spinner
import com.example.pchub.dao.Product
import android.widget.Toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class sell : Fragment() {

    private lateinit var productNameEditText: EditText
    private lateinit var productPriceEditText: EditText
    private lateinit var productDescriptionEditText: EditText
    private lateinit var addImageButton: Button
    private var imageUri: Uri? = null
    private lateinit var appDatabase: AppDatabase
    private lateinit var sellButton: Button
    //private lateinit var categorySpinner: Spinner

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        productNameEditText = view.findViewById(R.id.SellerProductName)
        productPriceEditText = view.findViewById(R.id.SellerProductPrice)
        productDescriptionEditText = view.findViewById(R.id.SellerProductDescription)
        addImageButton = view.findViewById(R.id.addImageButton)
        sellButton = view.findViewById(R.id.sellbutton)
        //categorySpinner = view.findViewById(R.id.categorySpinner)






        addImageButton.setOnClickListener {
            val imagePickerIntent = Intent(Intent.ACTION_PICK)
            imagePickerIntent.type = "image/*"
            startActivityForResult(imagePickerIntent, IMAGE_PICKER_REQUEST_CODE)

        }


        sellButton.setOnClickListener {
            val productName = productNameEditText.text.toString()
            val productPrice = productPriceEditText.text.toString()
            val productDescription = productDescriptionEditText.text.toString()



            if (productName.isBlank() || productPrice.isBlank() || productDescription.isBlank()) {
                showToast("Please fill in all fields.")
            } else {
                val product = Product(0, productName, productPrice, productDescription, imageUri.toString())

                Thread {
                    val productDao = appDatabase.productDao()
                    productDao.insertProduct(product)

                    val existingProduct = productDao.getAllProducts(productName)

                    requireActivity().runOnUiThread {
                        if (existingProduct != null) {
                            showToast("Data saved successfully!")

                            productNameEditText.text.clear()
                            productPriceEditText.text.clear()
                            productDescriptionEditText.text.clear()
                            imageUri = null
                        } else {
                            showToast("Failed to save data. Product does not exist in the database.")
                        }
                    }
                }.start()
            }
        }


        appDatabase = AppDatabase.getInstance(requireContext())
    }



    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == IMAGE_PICKER_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            val selectedImageUri = data?.data
            imageUri = selectedImageUri // Store the selected image URI

            addImageButton.text = "Image Added!"

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sell, container, false)
    }

    companion object {
        private const val IMAGE_PICKER_REQUEST_CODE = 1
    }
}

