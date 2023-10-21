package com.example.pchub

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController

class assembly : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val step1: CardView = view.findViewById(R.id.Step1_CardView)
        val step2: CardView = view.findViewById(R.id.Step2_CardView)
        val step3: CardView = view.findViewById(R.id.Step3_CardView)
        val step4: CardView = view.findViewById(R.id.Step4_CardView)
        val step5: CardView = view.findViewById(R.id.Step5_CardView)
        val step6: CardView = view.findViewById(R.id.Step6_CardView)
        val step7: CardView = view.findViewById(R.id.Step7_CardView)

        step1.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                assemstep1()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        step2.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                assemstep2()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        step3.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                assemstep3()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        step4.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                assemstep4()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        step5.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                assemstep5()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        step6.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                assemstep6()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        step7.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                assemstep7()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_assembly, container, false)
    }
}