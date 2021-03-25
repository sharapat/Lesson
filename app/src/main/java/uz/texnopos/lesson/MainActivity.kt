package uz.texnopos.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonPlus.setOnClickListener {
            if (et1.text.isNotEmpty() && et2.text.isNotEmpty()) {
                tvResult.text = "${et1.text.toString().toInt()+et2.text.toString().toInt()}"
            }
        }
    }

    fun onClick(view: View) {
        if (et1.text.isNotEmpty() && et2.text.isNotEmpty()) {
            when((view as Button).text) {
                "+" -> {
                    tvResult.text = "${et1.text.toString().toInt()+et2.text.toString().toInt()}"
                }
                "-" -> {
                    tvResult.text = "${et1.text.toString().toInt()-et2.text.toString().toInt()}"
                }
                "*" -> {
                    tvResult.text = "${et1.text.toString().toInt()*et2.text.toString().toInt()}"
                }
                "/" -> {
                    tvResult.text = "${et1.text.toString().toDouble()/et2.text.toString().toDouble()}"
                }
            }
        }
    }
}
