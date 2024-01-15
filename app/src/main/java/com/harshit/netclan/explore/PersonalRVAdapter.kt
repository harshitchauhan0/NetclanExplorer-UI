package com.harshit.netclan.explore

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.harshit.netclan.R

class PersonalRVAdapter(private val dataList: List<MyModel>): RecyclerView.Adapter<PersonalRVAdapter.MyViewHolder>() {


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val name: TextView = itemView.findViewById(R.id.name)
        private val address: TextView = itemView.findViewById(R.id.address)
        private val interest: TextView = itemView.findViewById(R.id.interest)
        private val status: TextView = itemView.findViewById(R.id.status)
        private val imageView: ImageView = itemView.findViewById(R.id.profile_pic)
        fun bind(model: MyModel) {
            name.text = model.name
            address.text = model.address
            interest.text = model.interests.toString()
            status.text = model.status
            Glide.with(itemView.context).load(model.imageResId).into(imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonalRVAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.personal_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonalRVAdapter.MyViewHolder, position: Int) {
        val model = dataList[position]
        holder.bind(model)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}