package uz.texnopos.lesson.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.inner_item.view.*
import uz.texnopos.lesson.data.InnerModel

class InnerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun innerPopulateModel(innerModel: InnerModel) {
        itemView.button.text = innerModel.buttonText
        itemView.innerTv.text = innerModel.title
    }
}
