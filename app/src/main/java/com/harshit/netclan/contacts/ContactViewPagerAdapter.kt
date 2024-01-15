package com.harshit.netclan.contacts

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ContactViewPagerAdapter(private val frag: FragmentActivity): FragmentStateAdapter(frag) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PersonalContactFragment()
            1 -> BusinessContactFragment()
            2 -> MerchantContactFragment()
            else -> PersonalContactFragment()
        }
    }
}