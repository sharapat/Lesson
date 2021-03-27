package uz.texnopos.lesson

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.lesson.data.InnerModel
import uz.texnopos.lesson.viewholder.InnerViewHolder

class InnerAdapter: RecyclerView.Adapter<InnerViewHolder>() {

    var data: List<InnerModel> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerViewHolder {
        val innerItemView = parent.inflate(R.layout.inner_item)
        return InnerViewHolder(innerItemView)
    }

    override fun onBindViewHolder(holder: InnerViewHolder, position: Int) {
        holder.innerPopulateModel(data[position])
    }

    override fun getItemCount() = data.size

}