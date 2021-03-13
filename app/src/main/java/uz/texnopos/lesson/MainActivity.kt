package uz.texnopos.lesson

import android.content.Context
import android.content.SharedPreferences
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var mediaPlayer: MediaPlayer
    lateinit var sharedPreferences: SharedPreferences
    private var position = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = getSharedPreferences(this.packageName, Context.MODE_PRIVATE)
        Log.d("ómirlik cikli", "onCreate")
        val buttonArray: MutableList<Button> = mutableListOf()
        val scrollView = HorizontalScrollView(this)
        val layout = LinearLayout(this)
        scrollView.addView(layout)
        layout.layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT)
        setContentView(scrollView)
        layout.orientation = LinearLayout.HORIZONTAL
        for (i in 1 .. 20) {
            val button = Button(this)
            buttonArray.add(button)
            button.setBackgroundResource(R.drawable.logo)
            button.text = "Button $i"
            button.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 100.dp)
            layout.addView(button)
        }
        buttonArray[0].onClick { Toast.makeText(this, "Jamshid qalay", Toast.LENGTH_SHORT).show() }
        buttonArray[1].onClick {
            Toast.makeText(this, "Poka, kettim", Toast.LENGTH_SHORT).show()
            layout.removeView(it)
        }
    }

    override fun onStart() {
        super.onStart()
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.audio)
        mediaPlayer = MediaPlayer.create(this, uri)
        position = sharedPreferences.getInt("position", 0)
        mediaPlayer.seekTo(position)
        mediaPlayer.start()
        Log.d("ómirlik cikli", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ómirlik cikli", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ómirlik cikli", "onRestart")
    }

    override fun onPause() {
        super.onPause()
        sharedPreferences.edit().putInt("position", mediaPlayer.currentPosition).apply()
        mediaPlayer.stop()
        Log.d("ómirlik cikli", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ómirlik cikli", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        sharedPreferences.edit().putInt("position", 0).apply()
        Log.d("ómirlik cikli", "onDestroy")
    }
}
