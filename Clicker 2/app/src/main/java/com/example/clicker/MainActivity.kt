package com.example.clicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.clicker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )

        val num = findViewById<TextView>(R.id.textView)
        var count = 0
        num.text = count.toString()

        val duration = Toast.LENGTH_SHORT

        binding.button.setOnClickListener {
            Toast.makeText(applicationContext, "Increment: " + count.toString() + " -> " + (count + 1).toString(), duration).show()
            count += 1
            num.text = count.toString()
        }

        binding.button2.setOnClickListener {
            Toast.makeText(applicationContext, "Decrement: " + count.toString() + " -> " + (count - 1).toString(), duration).show()
            count -= 1
            num.text = count.toString()
        }

        binding.button3.setOnClickListener {
            Toast.makeText(applicationContext, "Reset: $count -> 0", duration).show()
            count = 0
            num.text = count.toString()
        }
    }
}