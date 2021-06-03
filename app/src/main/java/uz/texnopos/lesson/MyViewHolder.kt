package uz.texnopos.lesson

import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val innerAdapter = InnerListAdapter()
    fun populateModel(model: MyModel) {
        itemView.tvTitle.text = model.firstName
        itemView.tvDescription.text = model.lastName
        itemView.info.adapter = innerAdapter
        innerAdapter.models = model.temalar
        itemView.info.isVisible = model.isExpanded
        itemView.setOnClickListener {
            model.isExpanded = !model.isExpanded
            itemView.info.isVisible = model.isExpanded
        }
    }
}