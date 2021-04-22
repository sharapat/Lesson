package uz.texnopos.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val myAdapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = myAdapter
        val list: MutableList<MyModel> = mutableListOf()
        for (i in 1 .. 100) {
            val student = MyModel("Student number #$i", "LastName $i")
            list.add(student)
        }
        myAdapter.data = list
    }

}
