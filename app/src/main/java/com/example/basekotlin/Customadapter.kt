package com.example.basekotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.basekotlin.Customadapter.viewholder
import kotlinx.android.synthetic.main.item_phone.view.*

class Customadapter(var context: Context, var arrphone: ArrayList<Phone>) :
    RecyclerView.Adapter<Customadapter.viewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
//        var layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
//        var view: View = layoutInflater.inflate(R.layout.item_phone, parent, false)
        return viewholder(LayoutInflater.from(parent.context).inflate(R.layout.item_phone, parent, false))
    }

    override fun getItemCount(): Int {
        return arrphone.size
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
       holder.tvname.text=arrphone.get(position).name
       holder.image.setImageResource(arrphone.get(position).anh)
    }

    class viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            var tvname = itemView.tvTen
            var image=itemView.imgAnh

    }
}