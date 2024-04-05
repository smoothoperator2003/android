package com.example.prac5 
import android.content.Context 
import android.net.ConnecƟvityManager
import androidx.appcompat.app.AppCompatAcƟvity
import android.os.Bundle 
import android.widget.Toast 
class MainAcƟvity : AppCompatAcƟvity() {
 override fun onCreate(savedInstanceState: Bundle?) { 
 super.onCreate(savedInstanceState) 
 setContentView(R.layout.acƟvity_main) 
 var c = applicaƟonContext.getSystemService(Context.CONNECTIVITY_SERVICE)as ConnecƟvityManager
 val NetworkInfo = c.acƟveNetworkInfo
 if(NetworkInfo!=null&&NetworkInfo.isConnected) 
 { 
 if(NetworkInfo.type==ConnecƟvityManager.TYPE_MOBILE){ 
 Toast.makeText(applicaƟonContext, "Connected to Mobile", 
 Toast.LENGTH_LONG).show() 
 } 
 if(NetworkInfo.type==ConnecƟvityManager.TYPE_WIFI){ 
 Toast.makeText(applicaƟonContext, "Connected to WiFi", 
 Toast.LENGTH_LONG).show() 
 } 
 else{ 
 Toast.makeText(applicaƟonContext, "You are Offline", 
 Toast.LENGTH_SHORT).show() 
 } 
 } 
 } 
} 
