package uz.texnopos.lesson.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*
import uz.texnopos.lesson.InnerAdapter
import uz.texnopos.lesson.data.Model

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun populateModel(model: Model) {
        val innerAdapter = InnerAdapter()
        itemView.innerRV.adapter = innerAdapter
        innerAdapter.data = model.list
    }
}