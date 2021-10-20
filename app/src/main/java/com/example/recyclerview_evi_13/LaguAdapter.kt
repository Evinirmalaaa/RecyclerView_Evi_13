package com.example.recyclerview_evi_13

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LaguAdapter (private val context: Context, private val Lagu: List<Lagu>, val listener: (Lagu) -> Unit)
    : RecyclerView.Adapter<LaguAdapter.LaguViewHolder>(){

    class LaguViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgLagu = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameLagu = view.findViewById<TextView>(R.id.tv_item_name)
        val descLagu = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(lagu: Lagu, listener: (Lagu) -> Unit) {
            imgLagu.setImageResource(lagu.imgLagu)
            nameLagu.text = lagu.nameLagu
            descLagu.text = lagu.descLagu
            itemView.setOnClickListener{
                listener(lagu)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaguViewHolder {
        return LaguViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_lagu, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LaguViewHolder, position: Int) {
        holder.bindView(Lagu[position], listener)
    }

    override fun getItemCount(): Int = Lagu.size
}