package com.example.wizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class InputBDay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_bday)

    }
    fun SaveBDay(view: View){
        val sumName = intent.getStringExtra(Name)
        val editBday = findViewById<EditText>(R.id.textPersonBDay)
        val messageBDay = editBday.text.toString()
        val intent = Intent(this, InputAdress::class.java).apply {
            putExtra(BDay, messageBDay)
            putExtra(Name, sumName)
        }
        startActivity(intent)
    }
    fun BackToName(view: View) {

        val intent = Intent(this, MainActivity::class.java).apply {
        }
        startActivity(intent)
    }
}