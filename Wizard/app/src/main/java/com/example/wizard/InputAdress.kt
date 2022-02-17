package com.example.wizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class InputAdress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_adress)
    }
    fun SaveAdress(view: View){
        val sumName = intent.getStringExtra(Name)
        val sumBDay = intent.getStringExtra(BDay)
        val editAdress = findViewById<EditText>(R.id.textPersonAdress)
        val messageAdress = editAdress.text.toString()
        val intent = Intent(this, Sum::class.java).apply {
            putExtra(Adress, messageAdress)
            putExtra(BDay, sumBDay)
            putExtra(Name, sumName)
        }
        startActivity(intent)
    }
    fun BackToBDay(view: View) {
        val intent = Intent(this, InputBDay::class.java).apply {
        }
        startActivity(intent)
    }
}