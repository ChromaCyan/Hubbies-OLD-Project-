package com.example.pchub.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pchub.R
import com.example.pchub.data.PcBundle

class PCBundleAdapter(private val pcBundles: List<PcBundle>) : RecyclerView.Adapter<PCBundleAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pcbundles, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pcBundles.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val pcBundle = pcBundles[position]
        holder.imageView.setImageResource(pcBundle.imageResource)
        holder.textView1.text = pcBundle.name
        holder.textView2.text = pcBundle.description
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.imagepc)
        val textView1: TextView = itemView.findViewById(R.id.productNameTextView1)
        val textView2: TextView = itemView.findViewById(R.id.descriptionTextView1)
    }
}