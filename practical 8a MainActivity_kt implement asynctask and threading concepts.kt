package com.example.prac8a

import android.app.ProgressDialog
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    var imageUrl: URL? = null
    var `is`: InputStream? = null
    var bmImg: Bitmap? = null
    var imageView: ImageView? = null
    var p: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.asyncTask)
        imageView = findViewById(R.id.image)

        button.setOnClickListener {
            val asyncTask = AsyncTaskExample()
            asyncTask.execute("Your Image URL Here")
        }
    }

    inner class AsyncTaskExample : AsyncTask<String?, String?, Bitmap?>() {
        override fun onPreExecute() {
            super.onPreExecute()
            p = ProgressDialog(this@MainActivity)
            p!!.setMessage("Please wait...It is downloading")
            p!!.isIndeterminate = false
            p!!.setCancelable(false)
            p!!.show()
        }

        override fun doInBackground(vararg p0: String?): Bitmap? {
            try {
                imageUrl = URL(p0[0])
                val conn = imageUrl!!.openConnection() as HttpURLConnection
                conn.doInput = true
                conn.connect()
                `is` = conn.inputStream
                val options = BitmapFactory.Options()
                options.inPreferredConfig = Bitmap.Config.RGB_565
                bmImg = BitmapFactory.decodeStream(`is`, null, options)
            } catch (e: IOException) {
                e.printStackTrace()
            }
            return bmImg
        }

        override fun onPostExecute(bitmap: Bitmap?) {
            super.onPostExecute(bitmap)
            if (imageView != null) {
                p!!.dismiss()
                imageView!!.setImageBitmap(bitmap)
            } else {
                p!!.show()
            }
        }
    }
}
