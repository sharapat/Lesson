package uz.texnopos.lesson

import android.app.Activity
import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class MyViewHolder(itemView: View, private val onItemClick: (title: String) -> Unit) : RecyclerView.ViewHolder(itemView) {
    fun jaylastir(data: Model) {
        itemView.tvTitle.text = data.title
        itemView.tvDescription.text = data.description
        itemView.setOnClickListener {
            onItemClick.invoke(data.title)
        }
    }
}
