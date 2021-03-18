package uz.texnopos.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private val adapter: MyAdapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        recycler.adapter = adapter
//        adapter.onItemClick = {
//            Toast.makeText(this, "ItemClicked $it", Toast.LENGTH_LONG).show()
//        }
        recycler.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        setData()
    }

    private fun setData() {
        val myList = mutableListOf<Model>()
        for (i in 1 .. 100) {
            val model = Model("Second Title $i", "Second Description $i")
            myList.add(model)
        }
        adapter.list = myList
    }
}