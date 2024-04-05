package com.example.prac5

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val connectivityManager = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo

        if (networkInfo != null && networkInfo.isConnected) {
            when (networkInfo.type) {
                ConnectivityManager.TYPE_MOBILE -> {
                    Toast.makeText(applicationContext, "Connected to Mobile", Toast.LENGTH_LONG).show()
                }
                ConnectivityManager.TYPE_WIFI -> {
                    Toast.makeText(applicationContext, "Connected to WiFi", Toast.LENGTH_LONG).show()
                }
                else -> {
                    Toast.makeText(applicationContext, "You are Offline", Toast.LENGTH_SHORT).show()
                }
            }
        } else {
            Toast.makeText(applicationContext, "You are Offline", Toast.LENGTH_SHORT).show()
        }
    }
}
