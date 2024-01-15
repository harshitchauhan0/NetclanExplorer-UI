package com.harshit.netclan.chats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.harshit.netclan.R


class ChatFragment : Fragment() {

    private lateinit var tabLayout:TabLayout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_chat, container, false)
        tabLayout = view.findViewById(R.id.tab_layout_chat)
        val viewPager = view.findViewById<ViewPager2>(R.id.viewPager_chat)
        val myViewPagerAdapter = ChatViewPagerAdapter(requireActivity())
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