package uz.texnopos.lesson

import android.app.Activity
import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun populateModel(model: Model, onClick: (model: Model) -> Unit) {
        itemView.tvTitle.text = model.title
        itemView.tvDescription.text = model.description
        itemView.setOnClickListener {
            onClick.invoke(model)
        }
    }
}