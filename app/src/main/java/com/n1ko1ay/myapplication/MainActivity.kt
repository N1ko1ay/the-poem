package com.n1ko1ay.myapplication

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG= "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Зовет меня взглядом и криком своим")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "И вымолвить хочет: «Давай улетим!")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Мы вольные птицы; пора, брат, пора!")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Туда, где за тучей белеет гора,")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Туда, где синеют морские края,")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Туда, где гуляем лишь ветер... да я!")
    }
}

