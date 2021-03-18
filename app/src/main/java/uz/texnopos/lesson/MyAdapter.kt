package uz.texnopos.lesson

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {

    var list: List<Model> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    private var onItemClick: (title: String) -> Unit = {}

    fun setOnItemClickListener(onItemClick: (title: String) -> Unit) {
        this.onItemClick = onItemClick
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyViewHolder(itemView, onItemClick)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.jaylastir(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}