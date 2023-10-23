package com.example.pchub.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pchub.R
import com.example.pchub.data.CpuBundle
import com.example.pchub.data.PcBundle

class SsdfragAdapter(private val cpuproducts: List<PcBundle>) : RecyclerView.Adapter<SsdfragAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cpuproducts, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cpuproducts.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val pcBundle = cpuproducts[position]
        holder.imageView.setImageResource(pcBundle.imageResource)
        holder.textView1.text = pcBundle.name
        holder.textView2.text = pcBundle.description
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.imagessd)
        val textView1: TextView = itemView.findViewById(R.id.productNameTextView6)
        val textView2: TextView = itemView.findViewById(R.id.descriptionTextView6)
    }
}