package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Button reference를 얻는다. roll_button으로부터 그리고 그 reference를 rollButton 변수에 할당한다.
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val cntUpButton: Button = findViewById(R.id.count_up_button)
        cntUpButton.setOnClickListener { countUp() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }
    }
    private fun rollDice(){

        //toast("button clicked")
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        if(resultText.text.toString() == "Hello World!"){
            resultText.text = "1"
        }else if(resultText.text.toString().toInt() < 6 ){
            resultText.text = (resultText.text.toString().toInt() +1).toString()
        }
    }

    private fun reset(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }
}
