package uz.texnopos.lesson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.inner_item.view.*

class InnerListAdapter : RecyclerView.Adapter<InnerListAdapter.InnerViewHolder>() {

    var models: List<String> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    inner class InnerViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun populateModel(text: String) {
            itemView.tvName.text = text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerViewHolder {
        return InnerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.inner_item, parent, false))
    }

    override fun onBindViewHolder(holder: InnerViewHolder, position: Int) {
        holder.populateModel(models[position])
    }

    override fun getItemCount() = models.size
}