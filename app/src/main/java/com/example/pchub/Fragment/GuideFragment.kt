package com.example.pchub.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import com.example.pchub.R


class GuideFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val step1: CardView = view.findViewById(R.id.Step1_CardView)
        val step2: CardView = view.findViewById(R.id.Step2_CardView)
        val step3: CardView = view.findViewById(R.id.Step3_CardView)
        val step4: CardView = view.findViewById(R.id.Step4_CardView)
        val step5: CardView = view.findViewById(R.id.Step5_CardView)
        val step6: CardView = view.findViewById(R.id.Step6_CardView)
        val step7: CardView = view.findViewById(R.id.Step7_CardView)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_guide, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() : GuideFragment {
            return GuideFragment()
        }
    }
}