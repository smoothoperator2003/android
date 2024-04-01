package com.example.prac8b 
import androidx.appcompat.app.AppCompatAcƟvity
import android.os.Bundle 
import android.widget.BuƩon
import android.widget.PopupMenu 
import android.widget.Toast 
class MainAcƟvity : AppCompatAcƟvity() {
 override fun onCreate(savedInstanceState: Bundle?) { 
 super.onCreate(savedInstanceState) 
 setContentView(R.layout.acƟvity_main) 
 val buƩon = findViewById<BuƩon>(R.id.buƩon) 
 buƩon.setOnClickListener { 
 val popupMenu: PopupMenu = PopupMenu(this,buƩon)
 popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu) 
 popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { 
 item -> when(item.itemId) { 
 R.id.acƟon_crick -> 
 Toast.makeText(this@MainAcƟvity, "You Clicked : " + item.Ɵtle, 
 Toast.LENGTH_SHORT).show() 
 R.id.acƟon_Ōbal -> 
 Toast.makeText(this@MainAcƟvity, "You Clicked : " + item.Ɵtle, 
 Toast.LENGTH_SHORT).show() 
 R.id.acƟon_hockey -> 
 Toast.makeText(this@MainAcƟvity, "You Clicked : " + item.Ɵtle, 
 Toast.LENGTH_SHORT).show() 
 } 
 true 
 }) 
 popupMenu.show() 
 } 
 } 
} 
