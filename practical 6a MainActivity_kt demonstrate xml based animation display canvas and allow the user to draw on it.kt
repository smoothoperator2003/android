package com.example.prac6 
import androidx.appcompat.app.AppCompatAcƟvity
import android.os.Bundle 
import android.os.Handler 
import android.view.View 
import android.view.animaƟon.AnimaƟonUƟls
import android.widget.TextView 
import java.uƟl.CollecƟons.rotate as rotate1 
class MainAcƟvity : AppCompatAcƟvity() {
 override fun onCreate(savedInstanceState: Bundle?) { 
 super.onCreate(savedInstanceState) 
 setContentView(R.layout.acƟvity_main) 
 val fade_in = findViewById<View>(R.id.fade_in) 
 val fade_out = findViewById<View>(R.id.fade_out) 
 val zoom_in = findViewById<View>(R.id.zoom_in) 
 val zoom_out = findViewById<View>(R.id.zoom_out) 
 val slide_down = findViewById<View>(R.id.slide_down) 
 val slide_up = findViewById<View>(R.id.slide_up) 
 val bounce = findViewById<View>(R.id.bounce) 
 val rotate = findViewById<View>(R.id.rotate) 
 fade_in.setOnClickListener { 
 val textView = findViewById<TextView>(R.id.textView) 
 textView.visibility = View.VISIBLE 
 val animaƟonFadeIn = AnimaƟonUƟls.loadAnimaƟon(this, R.anim.fade_in) 
 textView.startAnimaƟon(animaƟonFadeIn)
 } 
 fade_out.setOnClickListener { 
 val animaƟonFadeOut = AnimaƟonUƟls.loadAnimaƟon(this, R.anim.fade_out) 
 val textView = findViewById<TextView>(R.id.textView) 
 textView.startAnimaƟon(animaƟonFadeOut)
 Handler().postDelayed({ 
 textView.visibility = View.GONE 
 }, 1000) 
 } 
 zoom_in.setOnClickListener { 
 val animaƟonZoomIn = AnimaƟonUƟls.loadAnimaƟon(this, R.anim.zoom_in) 
 val textView = findViewById<TextView>(R.id.textView) 
 textView.startAnimaƟon(animaƟonZoomIn)
 } 
 zoom_out.setOnClickListener { 
 val animaƟonZoomOut = AnimaƟonUƟls.loadAnimaƟon(this, 
 R.anim.zoom_out) 
 val textView = findViewById<TextView>(R.id.textView) 
 textView.startAnimaƟon(animaƟonZoomOut)
 } 
 slide_down.setOnClickListener { 
 val animaƟonSlideDown = AnimaƟonUƟls.loadAnimaƟon(this, 
 R.anim.slide_in) 
 val textView = findViewById<TextView>(R.id.textView) 
 textView.startAnimaƟon(animaƟonSlideDown)
 } 
 slide_up.setOnClickListener { 
 val animaƟonSlideUp = AnimaƟonUƟls.loadAnimaƟon(this, R.anim.slide_out) 
 val textView = findViewById<TextView>(R.id.textView) 
 textView.startAnimaƟon(animaƟonSlideUp)
 } 
 bounce.setOnClickListener { 
 val animaƟonBounce = AnimaƟonUƟls.loadAnimaƟon(this, R.anim.bounce) 
 val textView = findViewById<TextView>(R.id.textView) 
 textView.startAnimaƟon(animaƟonBounce)
 } 
 rotate.setOnClickListener { 
 val animaƟonRotate = AnimaƟonUƟls.loadAnimaƟon(this, R.anim.rotate) 
 val textView = findViewById<TextView>(R.id.textView) 
 textView.startAnimaƟon(animaƟonRotate)
 } 
 } 
}
