package com.example.pchub.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import com.example.pchub.R


class GuideFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val assem: Button = view.findViewById(R.id.first_choice)
        val recommend: Button = view.findViewById(R.id.second_choice)

        val backbutton: ImageView = view.findViewById(R.id.back)

        backbutton.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }

        assem.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                assembly()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }

        recommend.setOnClickListener{
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(
                R.id.fragmentcontainer,
                recommendations()
            )
            transaction.addToBackStack(null)
            transaction.commit()
        }
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