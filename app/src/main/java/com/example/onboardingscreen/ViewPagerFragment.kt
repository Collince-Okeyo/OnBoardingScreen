package com.example.onboardingscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.onboardingscreen.screens.FirstScreen
import com.example.onboardingscreen.screens.SecondScreen
import com.example.onboardingscreen.screens.ThirdScreen

class ViewPagerFragment : Fragment() {
private lateinit var viewPager: ViewPager2
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_view_pager, container, false)

        viewPager = view.findViewById(R.id.viewPager2)

        val fragmentList = arrayListOf<Fragment>(
                FirstScreen(),
                SecondScreen(),
                ThirdScreen()
        )


        val adapter = ViewPagerAdapter(
                fragmentList,
                requireActivity().supportFragmentManager,
                lifecycle
        )

        viewPager?.adapter = adapter

        return view
    }

}