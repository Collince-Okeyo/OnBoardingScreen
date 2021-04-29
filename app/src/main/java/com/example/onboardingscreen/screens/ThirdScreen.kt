package com.example.onboardingscreen.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.onboardingscreen.R

class ThirdScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val finish = view.findViewById<TextView>(R.id.finish)

        finish.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
        })

        return view
    }

}