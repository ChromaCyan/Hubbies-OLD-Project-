package com.example.pchub.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pchub.Adapters.PCBundleAdapter
import com.example.pchub.R
import com.example.pchub.data.PcBundle

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PCBundleAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pcBundlesList = listOf(
            PcBundle("Corsair Ultra MX", "For high-end gaming and workstations", R.drawable.systemunit),
            PcBundle("MSI Core i5", "Mid-ranged bundle and beginner friendly to build", R.drawable.pc1)
        )
        recyclerView = view.findViewById(R.id.PCBundles)

        recyclerView = view.findViewById(R.id.PCBundles)
        adapter = PCBundleAdapter(pcBundlesList)

        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter

        val cpuproductsList = listOf(
            PcBundle("Ryzen 5", "For high end gamers", R.drawable.apu),
            PcBundle("Intel i5", "For midrange budget", R.drawable.installcpu),
        )

        recyclerView = view.findViewById(R.id.motheroardproducts)

        val cpu : ImageView = view.findViewById(R.id.cpu
        )
        recyclerView = view.findViewById(R.id.Cpuproducts)
        adapter = PCBundleAdapter(cpuproductsList)

        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter

        val motherboardproductslist = listOf(
            PcBundle("Aorus B460", "High-end gaming motherboard", R.drawable.b460),
            PcBundle("Aorus B450", "For midrange budget", R.drawable.b450),
        )

        recyclerView = view.findViewById(R.id.PCBundles)


        recyclerView = view.findViewById(R.id.motheroardproducts)
        adapter = PCBundleAdapter(motherboardproductslist)

        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter



        cpu.setOnClickListener {
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                cpu()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        val motherboard: ImageView = view.findViewById(R.id.motherboard)

        motherboard.setOnClickListener {
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                motherboard()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        val ssd1: ImageView = view.findViewById(R.id.SSD)

        ssd1.setOnClickListener {
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                ssd()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val graphics: ImageView = view.findViewById(R.id.graphics)

        graphics.setOnClickListener {
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                graphics()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        val psu: ImageView = view.findViewById(R.id.psu)

        psu.setOnClickListener {
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                psu()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        val backButton: ImageView = view.findViewById(R.id.back1)

        backButton.setOnClickListener {
            requireActivity().finish() // Finish the current activity to go back to the previous activity
        }
        val sellButton : ImageView = view.findViewById(R.id.sell)

        sellButton.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                sell()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }
}

