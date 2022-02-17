package com.example.wizard

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

const val Name = "This is a name"
const val BDay = "This is a BDAy"
const val Adress = "This is an address"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun SaveName(view: View) {
        val editText = findViewById<EditText>(R.id.TextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this, InputBDay::class.java).apply {
            putExtra(Name, message)
        }
        startActivity(intent)
    }
}

