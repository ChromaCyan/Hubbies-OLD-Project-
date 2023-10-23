package com.example.pchub.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pchub.Adapters.CpufragAdapter
import com.example.pchub.Adapters.GraphicfragAdapter
import com.example.pchub.Adapters.PCBundleAdapter
import com.example.pchub.R
import com.example.pchub.data.PcBundle


class graphics : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: GraphicfragAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backbutton: ImageView = view.findViewById(R.id.graphics)

        backbutton.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }
        val graphicList = listOf(
            PcBundle("Corsair Ultra MX", "For high-end gaming and workstations", R.drawable.systemunit),
            PcBundle("MSI Core i5", "Mid-ranged bundle and beginner friendly to build", R.drawable.pc1)
        )
        /*
        recyclerView = view.findViewById(R.id.cpu)

        recyclerView = view.findViewById(R.id.PCBundles)

        adapter = GraphicfragAdapter(graphicList)

        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter

         */
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_graphics, container, false)
    }
}