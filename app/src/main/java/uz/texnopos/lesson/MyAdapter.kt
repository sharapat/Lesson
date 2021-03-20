package uz.texnopos.lesson

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {

    var models: List<Model> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    private var onItemClick: (model: Model) -> Unit = {}
    fun setOnItemClickListener(onItemClick: (model: Model) -> Unit) {
        this.onItemClick = onItemClick
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = parent.inflate(R.layout.item)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.populateModel(models[position], onItemClick)
    }

    override fun getItemCount() = models.size
}