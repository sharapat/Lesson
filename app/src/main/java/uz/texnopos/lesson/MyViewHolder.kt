package uz.texnopos.lesson

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class MyViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun populateModel(model: MyModel) {
        itemView.tvTitle.text = model.firstName
        itemView.tvDescription.text = model.lastName
    }
}