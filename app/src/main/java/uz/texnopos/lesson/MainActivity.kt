package uz.texnopos.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*
import uz.texnopos.lesson.data.BaseModel
import uz.texnopos.lesson.data.Check
import uz.texnopos.lesson.data.Model
import uz.texnopos.lesson.data.SecondModel

class MainActivity : AppCompatActivity() {

    private val adapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        setData()
    }

    private fun setData() {
        val models = mutableListOf<BaseModel>()
        for(i in 1 .. 100) {
            if (i%5==0) {
                models.add(SecondModel("", "This is description of this photo $i"))
            } else {
                models.add(Model("Title #$i", "Description#$i"))
            }
        }
        adapter.models = models
    }

}
