package com.example.onboardingscreen.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.onboardingscreen.R

class SecondScreen : Fragment() {
    private lateinit var next2: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second_screen, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager2)
        next2 = view.findViewById(R.id.next2)

        next2.setOnClickListener {
            viewPager?.currentItem = 2
        }

        return view
    }

}