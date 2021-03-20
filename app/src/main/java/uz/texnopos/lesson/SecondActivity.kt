package uz.texnopos.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private val adapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        rv.adapter = adapter
        adapter.setOnItemClickListener {
            Toast.makeText(this, "This is Toast", Toast.LENGTH_LONG).show()
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