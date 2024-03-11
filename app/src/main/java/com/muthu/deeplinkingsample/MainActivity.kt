package com.muthu.deeplinkingsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView=findViewById(R.id.text_view)
        textView.setOnClickListener {
            startActivity(Intent(this,NextScreen::class.java))
        }
    }
}