package com.example.bashkirov_opisanie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class wi_fi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wi_fi)

            val backspace : ImageView = findViewById(R.id.iv_back_button)
        backspace.setOnClickListener {
            val intent = Intent(this@wi_fi, opisanie::class.java)
            startActivity(intent)
        }
    }
}