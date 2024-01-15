package com.harshit.netclan.explore

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ExploreViewPagerAdapter(private val frag: FragmentActivity): FragmentStateAdapter(frag) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PersonalFragment()
            1 -> BusinessFragment()
            2 -> MerchantFragment()
            else -> PersonalFragment()
        }
    }
}