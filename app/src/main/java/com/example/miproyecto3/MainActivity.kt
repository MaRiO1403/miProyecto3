package com.example.miproyecto3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val url = "https://es.wikipedia.org/wiki/Elon_Musk"
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val url = "https://es.wikipedia.org/wiki/Fernando_Alonso"
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val url = "https://es.wikipedia.org/wiki/Willyrex"
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val url = "https://es.wikipedia.org/wiki/Akihiro_Hino"
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}