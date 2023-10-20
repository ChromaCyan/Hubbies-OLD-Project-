package com.example.pchub.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.pchub.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cpu: ImageView = view.findViewById(R.id.cpu)

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

