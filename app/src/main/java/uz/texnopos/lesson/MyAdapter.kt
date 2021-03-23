package uz.texnopos.lesson

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.texnopos.lesson.data.BaseModel
import uz.texnopos.lesson.data.Model
import uz.texnopos.lesson.data.SecondModel
import uz.texnopos.lesson.viewholder.MyViewHolder
import uz.texnopos.lesson.viewholder.SecondViewHolder

class MyAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var models: List<BaseModel> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return models[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == BaseModel.FIRST_TYPE) {
            val itemView = parent.inflate(R.layout.item)
            return MyViewHolder(itemView)
        } else {
            val itemView = parent.inflate(R.layout.item_second)
            return SecondViewHolder(itemView)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (models[position].type == BaseModel.FIRST_TYPE) {
            (holder as MyViewHolder).populateModel(models[position] as Model)
        } else {
            (holder as SecondViewHolder).populateModel(models[position] as SecondModel)
        }
    }

    override fun getItemCount() = models.size
}
