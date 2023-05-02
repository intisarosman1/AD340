package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.text = "Button"

        button.setOnClickListener {
            val toast = Toast.makeText(applicationContext, "You clicked the button!", Toast.LENGTH_SHORT)
            toast.show()
        }

    }
}