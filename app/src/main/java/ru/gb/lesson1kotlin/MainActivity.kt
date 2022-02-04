package ru.gb.lesson1kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import ru.gb.lesson1kotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text: TextView = findViewById(R.id.text)
        val enterText: EditText = findViewById(R.id.enter_text)
        val button: Button = findViewById(R.id.button_click)

        button.setOnClickListener { text.text = enterText.text }
    }
}