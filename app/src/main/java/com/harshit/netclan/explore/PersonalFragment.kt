package com.harshit.netclan.explore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.harshit.netclan.R
import com.harshit.netclan.databinding.FragmentPersonalBinding

class PersonalFragment : Fragment() {

    private lateinit var binding: FragmentPersonalBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_personal,container,false)

        binding.searchView.setOnClickListener {

        }

        binding.filterIV.setOnClickListener {

        }

        val data: List<MyModel> = listOf(
            MyModel("Jack","San Francisco", listOf("Friends","Coffee"),"Hey Lets Connect","https://placebear.com/g/200/200"),
            MyModel("Sam","New York",listOf("Friends","Coffee"),"Would Love to meet new People","https://via.placeholder.com/300.png/09f/fff")
        ) // Replace with your data

        val layoutManager = LinearLayoutManager(activity)
        binding.recyclerView.layoutManager = layoutManager

        val adapter = PersonalRVAdapter(data)
        binding.recyclerView.adapter = adapter

        return binding.root
    }

}