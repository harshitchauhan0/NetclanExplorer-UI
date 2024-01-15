package com.harshit.netclan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.android.material.navigation.NavigationBarView
import com.harshit.netclan.chats.ChatFragment
import com.harshit.netclan.contacts.ContactsFragment
import com.harshit.netclan.databinding.ActivityExploreBinding
import com.harshit.netclan.explore.ExploreFragment
import com.harshit.netclan.groups.GroupsFragment
import com.harshit.netclan.network.NetworkFragment

class ExploreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExploreBinding
    private lateinit var exploreFragment: ExploreFragment
    private lateinit var chatFragment: ChatFragment
    private lateinit var contactsFragment: ContactsFragment
    private lateinit var groupsFragment: GroupsFragment
    private lateinit var networkFragment: NetworkFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_explore)
        setSupportActionBar(binding.toolbar)
        exploreFragment = ExploreFragment()
        chatFragment = ChatFragment()
        contactsFragment = ContactsFragment()
        groupsFragment = GroupsFragment()
        networkFragment = NetworkFragment()

        supportFragmentManager.beginTransaction().replace(R.id.container,exploreFragment).commit()
        binding.bottomNavigation.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener {
            when (it.itemId) {
                R.id.explore -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container, exploreFragment).commit()
                    return@OnItemSelectedListener true
                }
                R.id.network -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container, networkFragment).commit()
                    return@OnItemSelectedListener true
                }
                R.id.chat -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container, chatFragment).commit()
                    return@OnItemSelectedListener true
                }
                R.id.contacts -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container, contactsFragment).commit()
                    return@OnItemSelectedListener true
                }
                R.id.groups -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container, groupsFragment).commit()
                    return@OnItemSelectedListener true
                }
                else -> return@OnItemSelectedListener false
            }
        })

        binding.navigationIcon.setOnClickListener {
//            We have to add bar,and add on fragments...
        }

        binding.refineBTN.setOnClickListener {
            startActivity(Intent(this,RefineActivity::class.java))
        }






    }
}