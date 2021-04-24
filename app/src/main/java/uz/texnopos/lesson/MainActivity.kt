package uz.texnopos.lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var adapter:ListViewAdapter = ListViewAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = adapter
        adapter.onItemClick = {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        setData()
    }

    private fun setData(){
        var models:MutableList<User> = mutableListOf()
        for(i in 0 until 1000){
            var model = User()
            model.Name = "Name ${i+1}"
            model.LastName = "LastName${i+1}"
            models.add(model)
        }
        adapter.models = models
    }

}
