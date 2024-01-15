package com.harshit.netclan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.harshit.netclan.databinding.ActivityRefineBinding
import android.icu.text.NumberFormat
import android.icu.util.Currency
import android.view.View
import android.widget.AdapterView
import android.widget.Toast


class RefineActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRefineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_refine)

        val array:MutableList<String> = mutableListOf("Available | Hey Let Us Connect","Away | Stay Discrete And Watch",
            "Busy | Do Not Disturb | Will Catch Up Later","SOS | Emergency | Need Assistance! HELP")
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,array)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.adapter = adapter
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>,view: View?,position: Int,id: Long) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                Toast.makeText(applicationContext,"Selected: $selectedItem",Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        binding.backIV.setOnClickListener {
            startActivity(Intent(this,ExploreActivity::class.java))
        }

        binding.button.setOnClickListener {
            // we will save data in database
            startActivity(Intent(this,ExploreActivity::class.java))
        }

        // we can set for all other textViews etc.


    }
}
