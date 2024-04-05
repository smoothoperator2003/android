package com.example.prac3a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val html = findViewById<ImageView>(R.id.html)
        val python = findViewById<ImageView>(R.id.python)
        val java = findViewById<ImageView>(R.id.java)
        val kotlin = findViewById<ImageView>(R.id.kotlin)
        val ruby = findViewById<ImageView>(R.id.ruby)
        val go = findViewById<ImageView>(R.id.go)
        
        html.setOnClickListener {
            Toast.makeText(applicationContext, "You Clicked HTML Logo", Toast.LENGTH_LONG).show()
        }
        
        python.setOnClickListener {
            Toast.makeText(applicationContext, "You Clicked Python Logo", Toast.LENGTH_LONG).show()
        }
        
        java.setOnClickListener {
            Toast.makeText(applicationContext, "You Clicked Java Logo", Toast.LENGTH_LONG).show()
        }
        
        kotlin.setOnClickListener {
            Toast.makeText(applicationContext, "You Clicked Kotlin Logo", Toast.LENGTH_LONG).show()
        }
        
        ruby.setOnClickListener {
            Toast.makeText(applicationContext, "You Clicked Ruby Logo", Toast.LENGTH_LONG).show()
        }
        
        go.setOnClickListener {
            Toast.makeText(applicationContext, "You Clicked GO Logo", Toast.LENGTH_LONG).show()
        }
    }
}
