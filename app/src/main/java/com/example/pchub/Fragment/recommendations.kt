package com.example.pchub.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.example.pchub.R

class recommendations : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val step1: CardView = view.findViewById(R.id.Step1_CardView)
        val step2: CardView = view.findViewById(R.id.Step2_CardView)
        val step3: CardView = view.findViewById(R.id.Step3_CardView)
        val step4: CardView = view.findViewById(R.id.Step4_CardView)
        val step5: CardView = view.findViewById(R.id.Step5_CardView)
        val step6: CardView = view.findViewById(R.id.Step6_CardView)
        val step7: CardView = view.findViewById(R.id.Step7_CardView)

        val backbutton: ImageView = view.findViewById(R.id.back)

        backbutton.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }

        step1.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                recommend_button1()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        step2.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                recommend_button2()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        step3.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                recommend_button3()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        step4.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                recommend_button4()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        step5.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                recommend_button5()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        step6.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                recommend_button6()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
        step7.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                recommend_button7()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_recommendations, container, false)
    }
}