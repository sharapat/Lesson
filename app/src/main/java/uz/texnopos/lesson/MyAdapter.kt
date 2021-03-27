package uz.texnopos.lesson

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.lesson.data.Model
import uz.texnopos.lesson.viewholder.MyViewHolder

class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {

    var models: List<Model> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = parent.inflate(R.layout.item)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.populateModel(models[position])
    }

    override fun getItemCount() = models.size
}
