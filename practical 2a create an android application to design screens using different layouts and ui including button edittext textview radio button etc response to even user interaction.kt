package com.example.prac2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val name = findViewById<EditText>(R.id.name)
        val submitButton = findViewById<Button>(R.id.button2)
        val displayMessage = findViewById<TextView>(R.id.textViewR)
        val displayMessage2 = findViewById<TextView>(R.id.textViewR2)
        val displayMessage3 = findViewById<TextView>(R.id.textViewR3)
        val userNumber = findViewById<EditText>(R.id.mobileNumber)
        val radioGroupButton = findViewById<RadioGroup>(R.id.radioButtonGroup)
        
        radioGroupButton.setOnCheckedChangeListener { group, checkedId ->
            val radio1 = findViewById<RadioButton>(R.id.radioButton)
            val radio2 = findViewById<RadioButton>(R.id.radioButton2)
            if (checkedId == R.id.radioButton) {
                Toast.makeText(this, radio1.text.toString(), Toast.LENGTH_SHORT).show()
                displayMessage3.text = radio1.text
            }
            if (checkedId == R.id.radioButton2) {
                Toast.makeText(this, radio2.text.toString(), Toast.LENGTH_SHORT).show()
                displayMessage3.text = radio2.text
            }
        }
        
        submitButton.setOnClickListener {
            displayMessage.text = "Welcome:- ${name.text}!"
            displayMessage2.text = userNumber.text
        }
    }
}
