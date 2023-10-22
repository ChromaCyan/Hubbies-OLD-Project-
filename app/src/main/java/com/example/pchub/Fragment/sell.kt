package com.example.pchub.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import com.example.pchub.R
import android.app.Activity
import com.example.pchub.data.ProductEntity


class sell : Fragment() {

    private var imagePath: String? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backbutton: ImageView = view.findViewById(R.id.back) // Replace with the actual ID of your ImageView

        backbutton.setOnClickListener {
            // Pop the back stack to navigate back to the HomeFragment
            requireActivity().supportFragmentManager.popBackStack()
        }
    }

    fun onAddImageClick(view: View) {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_PICKER_REQUEST_CODE)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val productName = view?.findViewById<EditText>(R.id.SellerProductName)?.text.toString()
        val Productprice = view?.findViewById<EditText>(R.id.SellerProductPrice)?.text.toString()
        val descriptionTxt = view?.findViewById<EditText>(R.id.SellerProductDescription)?.text.toString()

        val price = Productprice.toDoubleOrNull() ?: 0.0

        val product = ProductEntity(name= productName, price = price, description = descriptionTxt, imagePath = imagePath)


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == IMAGE_PICKER_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            val selectedImage = data?.data
            // Get the selected image's file path
            imagePath = selectedImage?.path
        }
    }

    companion object {
        private const val IMAGE_PICKER_REQUEST_CODE = 1
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sell, container, false)
    }
}