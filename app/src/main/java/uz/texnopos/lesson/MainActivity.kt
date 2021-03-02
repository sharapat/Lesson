package uz.texnopos.lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.button.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var firstNumber: Int = 0
    var secondNumber: Int = 0
    var sign: Int = 0
    var answers = IntArray(4) {0}
    var correctAnswerIndex = 0
    var correctAnswer = 0
    var score = 0
    var level = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button)
        nextTask()
        answer1.setOnClickListener(onAnswerClicked)
        answer2.setOnClickListener(onAnswerClicked)
        answer3.setOnClickListener(onAnswerClicked)
        answer4.setOnClickListener(onAnswerClicked)
    }

    private val onAnswerClicked : (view: View) -> Unit = {
        if ((it as Button).text == correctAnswer.toString()) {
            score++
        }
        if (level == 3) {
            val myIntent = Intent(this, GameOverActivity::class.java)
            myIntent.putExtra("ball", score)
            startActivity(myIntent)
            finish()
        } else {
            level++
            nextTask()
        }
    }

    private fun nextTask() {
        firstNumber = Random.nextInt(100)
        secondNumber = Random.nextInt(100)
        sign = Random.nextInt(4)
        for (i in 0 until 4) {
            answers[i] = Random.nextInt(100)
        }
        correctAnswerIndex = Random.nextInt(4)
        when(sign) {
            0 -> {
                tvSign.text = "+"
                correctAnswer = firstNumber + secondNumber
            }
            1 -> {
                tvSign.text = "-"
                correctAnswer = firstNumber - secondNumber
            }
            2 -> {
                tvSign.text = "*"
                correctAnswer = firstNumber * secondNumber
            }
            3 -> {
                tvSign.text = "/"
                correctAnswer = firstNumber/secondNumber
            }
        }
        answers[correctAnswerIndex] = correctAnswer
        tvFirstNumber.text = firstNumber.toString()
        tvSecondNumber.text = secondNumber.toString()
        answer1.text = answers[0].toString()
        answer2.text = answers[1].toString()
        answer3.text = answers[2].toString()
        answer4.text = answers[3].toString()
    }

}