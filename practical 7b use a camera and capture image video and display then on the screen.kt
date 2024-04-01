package com.example.prac7b 
import android.content.Intent 
import android.graphics.Bitmap 
import android.os.Bundle 
import android.provider.MediaStore 
import android.view.View 
import android.widget.BuƩon
import android.widget.ImageView 
import androidx.appcompat.app.AppCompatAcƟvity
class MainAcƟvity : AppCompatAcƟvity() {
 // Define the buƩon and imageview type variable
 private lateinit var cameraOpenId: BuƩon
 lateinit var clickImageId: ImageView 
 override fun onCreate(savedInstanceState: Bundle?) { 
 super.onCreate(savedInstanceState) 
 setContentView(R.layout.acƟvity_main) 
 // By ID we can get each component which id is assigned in XML file get BuƩons and imageview.
 cameraOpenId = findViewById(R.id.camera_buƩon) 
 clickImageId = findViewById(R.id.click_image) 
 // Camera_open buƩon is for open the camera and add the setOnClickListener in this buƩon
 cameraOpenId.setOnClickListener(View.OnClickListener { v: View? -> 
 // Create the camera_intent ACTION_IMAGE_CAPTURE it will open the camera for capture the image 
 val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE) 
 // Start the acƟvity with camera_intent, and request pic id
 startAcƟvityForResult(cameraIntent, pic_id) 
 }) 
 } 
 // This method will help to retrieve the image 
 override fun onAcƟvityResult(requestCode: Int, resultCode: Int, data: Intent?) { 
 super.onAcƟvityResult(requestCode, resultCode, data)
 // Match the request 'pic id with requestCode 
 if (requestCode == pic_id) { 
 // BitMap is data structure of image file which store the image in memory 
 val photo = data!!.extras!!["data"] as Bitmap? 
 // Set the image in imageview for display 
 clickImageId.setImageBitmap(photo) 
 } 
 } 
 companion object { 
 // Define the pic id 
 private const val pic_id = 123 
 } 
} 
