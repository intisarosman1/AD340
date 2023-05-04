package com.example.shiba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class gMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val food = findViewById<Button>(R.id.button)
        food.text = "Food"

        val touch = findViewById<Button>(R.id.button2)
        touch.text = "Touch"

        val image = findViewById<ImageView>(R.id.imageView)

        food.setOnClickListener {
            image.setBackgroundResource(R.drawable.calm)
            val toast = Toast.makeText(applicationContext, "Calm Shiba Inu!", Toast.LENGTH_SHORT)
            toast.show()

        }

        touch.setOnClickListener {
            image.setBackgroundResource(R.drawable.angry)
            val toast = Toast.makeText(applicationContext, "Angry Shiba Inu!", Toast.LENGTH_SHORT)
            toast.show()

        }
    }
}