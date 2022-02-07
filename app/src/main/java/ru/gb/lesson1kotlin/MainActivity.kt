package ru.gb.lesson1kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterText: EditText = findViewById(R.id.enter_text)
        val button: Button = findViewById(R.id.button_click)
        val textOutput: TextView = findViewById(R.id.textOutput)
        val onePigNickname: TextView = findViewById(R.id.onePigNickname)
        val onePigWeight: TextView = findViewById(R.id.onePigWeight)
        val twoPigNickname: TextView = findViewById(R.id.twoPigNickname)
        val twoPigWeight: TextView = findViewById(R.id.twoPigWeight)
        val threePigNickname: TextView = findViewById(R.id.threePigNickname)
        val threePigWeight: TextView = findViewById(R.id.threePigWeight)

        button.setOnClickListener { textOutput.text = enterText.text }

        val pig = Pigs()
        val pig2 = pig.copy(name = "Наф-Наф")

        onePigNickname.text = pig.name
        onePigWeight.text = pig.weight.toString()

        twoPigNickname.text = pig2.name
        twoPigWeight.text = pig2.weight.toString()

        threePigNickname.text = NewPigs.pig3.name
        threePigWeight.text = NewPigs.pig3.weight.toString()
    }
}