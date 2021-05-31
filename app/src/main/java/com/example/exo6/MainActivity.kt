package com.example.exo6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("mot", tv.text)
            intent.putExtra("img", "animal.png")

            startActivity(intent)
        }
        tv2.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("mot", tv2.text)
            intent.putExtra("img", "family.jpg")

            startActivity(intent)
        }
    }
}