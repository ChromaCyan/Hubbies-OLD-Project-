package com.example.pchub.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pchub.Adapters.PCBundleAdapter
import com.example.pchub.R
import com.example.pchub.dao.Product
import com.example.pchub.dao.ProductDao
import com.example.pchub.data.CpuBundle
import com.example.pchub.data.PcBundle

class cpu : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backbutton: ImageView = view.findViewById(R.id.back)

        backbutton.setOnClickListener {
            // Pop the back stack to navigate back to the HomeFragment
            requireActivity().supportFragmentManager.popBackStack()
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cpu, container, false)
    }
}