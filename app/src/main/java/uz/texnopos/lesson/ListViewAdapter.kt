package uz.texnopos.lesson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListViewAdapter:RecyclerView.Adapter<ListViewHolder>() {
    var models:List<User> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    var onItemClick: (user: User) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.populeatmodel(models[position], onItemClick)
    }

    override fun getItemCount(): Int {
       return models.size
    }
}