package uz.texnopos.lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        setData()
    }
    private fun setData() {
        val models = mutableListOf<Model>()
        for(i in 1 .. 100) {
            val model = Model("Title #$i", "Description#$i")
            models.add(model)
        }
        adapter.models = models
    }
}
