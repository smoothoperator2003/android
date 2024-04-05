package com.example.prac4 
import android.content.Intent 
import android.net.Uri 
import androidx.appcompat.app.AppCompatAcƟvity
import android.os.Bundle 
import android.widget.BuƩon
class MainAcƟvity : AppCompatAcƟvity() {
 override fun onCreate(savedInstanceState: Bundle?) { 
 super.onCreate(savedInstanceState) 
 setContentView(R.layout.acƟvity_main) 
 val btn = findViewById<BuƩon>(R.id.buƩon) 
 btn.setOnClickListener() { 
 intent = Intent(Intent.ACTION_VIEW) 
 intent.setData(Uri.parse("hƩps://www.javatpoint.com/")) 
 startAcƟvity(intent) 
 /* intent= Intent(Intent.ACTION_VIEW, 
 Uri.parse("hƩps://www.javatpoint.com/"))
 startAcƟvity(intent)*/
 } 
 } 
} 
