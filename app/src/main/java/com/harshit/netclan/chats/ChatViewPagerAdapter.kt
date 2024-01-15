package com.harshit.netclan.chats

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
class ChatViewPagerAdapter(private val frag: FragmentActivity): FragmentStateAdapter(frag) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ChatsFragment()
            1 -> CallsFragment()
            else -> ChatsFragment()
        }
    }
}