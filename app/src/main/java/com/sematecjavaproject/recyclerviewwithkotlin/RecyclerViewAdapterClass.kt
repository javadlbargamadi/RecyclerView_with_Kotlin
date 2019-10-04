package com.sematecjavaproject.recyclerviewwithkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_item.view.*

class RecyclerViewAdapterClass(val list: List<String>) :
    RecyclerView.Adapter<RecyclerViewAdapterClass.RecyclerViewAdapterViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapterViewHolder {

        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return RecyclerViewAdapterViewHolder(v)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecyclerViewAdapterViewHolder, position: Int) {

        holder.onBind(list[position])
    }

    class RecyclerViewAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(s: String) {
            itemView.txt.text = s
        }
    }
}