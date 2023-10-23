package com.example.pchub.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pchub.Adapters.CpufragAdapter
import com.example.pchub.Adapters.MotherboardfragAdapter
import com.example.pchub.Adapters.PCBundleAdapter
import com.example.pchub.R
import com.example.pchub.data.PcBundle


class motherboard : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MotherboardfragAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backbutton: ImageView = view.findViewById(R.id.back) // Replace with the actual ID of your ImageView

        backbutton.setOnClickListener {
            // Pop the back stack to navigate back to the HomeFragment
            requireActivity().supportFragmentManager.popBackStack()
        }
        /*
        val MotherboardList = listOf(
            PcBundle("Corsair Ultra MX", "For high-end gaming and workstations", R.drawable.systemunit),
            PcBundle("MSI Core i5", "Mid-ranged bundle and beginner friendly to build", R.drawable.pc1)
        )
        recyclerView = view.findViewById(R.id.motherboard)

        adapter = MotherboardfragAdapter(MotherboardList)

        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter

         */
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_motherboard, container, false)
    }
}