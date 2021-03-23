package uz.texnopos.lesson.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_second.view.*
import uz.texnopos.lesson.data.SecondModel

class SecondViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun populateModel(model: SecondModel) {
        itemView.tvTitle.text = model.title
    }
}