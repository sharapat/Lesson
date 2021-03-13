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
