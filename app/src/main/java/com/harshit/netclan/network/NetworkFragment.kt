package com.harshit.netclan.network

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.harshit.netclan.R
import com.harshit.netclan.explore.ExploreViewPagerAdapter

class NetworkFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_network, container, false)
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout_network)
        val viewPager = view.findViewById<ViewPager2>(R.id.viewPager_network)
        val myViewPagerAdapter = NetworkViewPagerAdapter(requireActivity())
        viewPager.adapter = myViewPagerAdapter

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        }
        )

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.getTabAt(position)!!.select()
            }
        })


        return view
    }

}