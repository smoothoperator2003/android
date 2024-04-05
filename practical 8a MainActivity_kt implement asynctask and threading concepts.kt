package com.example.prac8a 
import android.app.ProgressDialog 
import android.graphics.Bitmap 
import android.graphics.BitmapFactory 
import android.net.wifi.WifiConfiguraƟon.AuthAlgorithm.strings 
import android.os.AsyncTask 
import android.os.Bundle 
import android.support.v7.app.AppCompatAcƟvity
import android.widget.BuƩon
import android.widget.ImageView 
import java.io.IOExcepƟon
import java.io.InputStream 
import java.net.HƩpURLConnecƟon
import java.net.URL 
enum class AsyncTaskExample { 
} 
class MainAcƟvity : AppCompatAcƟvity() {
 var ImageUrl: URL? = null 
 var `is`: InputStream? = null 
 var bmImg: Bitmap? = null 
 var imageView: ImageView? = null 
 var p: ProgressDialog? = null 
 override fun onCreate(savedInstanceState: Bundle?) { 
 super.onCreate(savedInstanceState) 
 setContentView(R.layout.acƟvity_main)
 val buƩon = findViewById<BuƩon>(R.id.asyncTask) 
 imageView = findViewById(R.id.image) 
 buƩon.setOnClickListener { 
 val asyncTask: AsyncTaskExample = this.AsyncTaskExample() { 
 } 
 } 
 abstract class AsyncTaskExample : 
 AsyncTask<String?, String?, Bitmap?>() { 
 override fun onPreExecute() { 
 super.onPreExecute() 
 p = ProgressDialog(this@MainAcƟvity) 
 p!!.setMessage("Please wait...It is downloading") 
 p!!.isIndeterminate = false 
 p!!.setCancelable(false) 
 p!!.show() 
 } 
 protected override fun doInBackground(vararg p0: String?): Bitmap? { 
 try { 
 ImageUrl = URL(strings[0]) 
 val conn = ImageUrl!!.openConnecƟon() as HƩpURLConnecƟon
 conn.doInput = true 
 conn.connect() 
 `is` = conn.inputStream 
 val opƟons = BitmapFactory.OpƟons()
 opƟons.inPreferredConfig = Bitmap.Config.RGB_565 
 bmImg = BitmapFactory.decodeStream(`is`, null, opƟons)
 } catch (e: IOExcepƟon) {
 e.printStackTrace() 
 } 
 return bmImg 
 } 
 override fun onPostExecute(bitmap: Bitmap?) { 
 super.onPostExecute(bitmap) 
 if (imageView != null) { 
 p!!.hide() 
 imageView!!.setImageBitmap(bitmap) 
 } else { 
 p!!.show() 
 } 
 } 
 } 
 } 
 private fun AsyncTaskExample(funcƟon: () -> Unit) { 
 "TODO(\"Not yet implemented\")" 
 } 
} 
