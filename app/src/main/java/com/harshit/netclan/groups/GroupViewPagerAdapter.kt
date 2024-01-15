package com.harshit.netclan.groups

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
class GroupViewPagerAdapter(private val frag: FragmentActivity): FragmentStateAdapter(frag) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AllFragment()
            1 -> MyGroupsFragment()
            2 -> EventsFragment()
            else -> AllFragment()
        }
    }
}