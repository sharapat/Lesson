package uz.texnopos.lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val myAdapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myAdapter.setOnItemClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        listView.adapter = myAdapter
        listView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        setData()
    }

    private fun setData() {
        val myList = mutableListOf<Model>()
        for (i in 1 .. 100) {
            val model = Model("Title $i", "Description $i")
            myList.add(model)
        }
        myAdapter.list = myList
    }
}
