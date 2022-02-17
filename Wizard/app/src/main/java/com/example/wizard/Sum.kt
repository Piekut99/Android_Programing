package com.example.wizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Sum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sum)

        val sumName = intent.getStringExtra(Name)
        val sumBDay = intent.getStringExtra(BDay)
        val sumAdress = intent.getStringExtra(Adress)

        val textViewName = findViewById<TextView>(R.id.textViewName).apply {
            text = sumName
        }
        val textViewBDay = findViewById<TextView>(R.id.textViewBDay).apply {
            text = sumBDay
        }
        val textViewAdress = findViewById<TextView>(R.id.textViewAdress).apply {
            text = sumAdress
        }
    }
    fun BackToAddress(view: View) {
        val intent = Intent(this, InputAdress::class.java).apply {
        }
        startActivity(intent)
    }
}