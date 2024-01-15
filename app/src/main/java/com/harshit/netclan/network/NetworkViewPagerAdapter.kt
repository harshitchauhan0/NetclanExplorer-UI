package com.harshit.netclan.network

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
class NetworkViewPagerAdapter(private val frag: FragmentActivity): FragmentStateAdapter(frag) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> NewInvitationFragment()
            1 -> AllInvitationFragment()
            else -> NewInvitationFragment()
        }
    }
}