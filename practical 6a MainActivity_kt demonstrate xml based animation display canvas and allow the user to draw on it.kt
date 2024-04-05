package com.example.prac6

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
            val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            textView.startAnimation(animationFadeIn)
        }

        fade_out.setOnClickListener {
            val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            val textView = findViewById<TextView>(R.id.textView)
            textView.startAnimation(animationFadeOut)
            Handler().postDelayed({
                textView.visibility = View.GONE
            }, 1000)
        }

        zoom_in.setOnClickListener {
            val animationZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            val textView = findViewById<TextView>(R.id.textView)
            textView.startAnimation(animationZoomIn)
        }

        zoom_out.setOnClickListener {
            val animationZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            val textView = findViewById<TextView>(R.id.textView)
            textView.startAnimation(animationZoomOut)
        }

        slide_down.setOnClickListener {
            val animationSlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_down)
            val textView = findViewById<TextView>(R.id.textView)
            textView.startAnimation(animationSlideDown)
        }

        slide_up.setOnClickListener {
            val animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up)
            val textView = findViewById<TextView>(R.id.textView)
            textView.startAnimation(animationSlideUp)
        }

        bounce.setOnClickListener {
            val animationBounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
            val textView = findViewById<TextView>(R.id.textView)
            textView.startAnimation(animationBounce)
        }

        rotate.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
            val textView = findViewById<TextView>(R.id.textView)
            textView.startAnimation(animationRotate)
        }
    }
}
