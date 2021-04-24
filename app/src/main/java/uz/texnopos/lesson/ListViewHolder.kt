package uz.texnopos.lesson

import android.content.Intent
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ListViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    var name:TextView = itemView.userName
    var lastname:TextView = itemView.userLastname
    fun populeatmodel(user: User, onItemClick: (user: User) -> Unit){
        name.text = user.Name
        lastname.text = user.LastName
        itemView.setOnClickListener {
            onItemClick.invoke(user)
        }
    }
}