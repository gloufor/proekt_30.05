package com.example.bashkirov_opisanie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class opisanie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opisanie)

           val backspace : ImageView = findViewById(R.id.iv_back_button)
        backspace.setOnClickListener {
            val intent = Intent(this@opisanie, wi_fi::class.java)
            startActivity(intent)
        }
    }
}