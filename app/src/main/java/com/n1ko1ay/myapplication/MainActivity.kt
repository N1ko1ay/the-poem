package com.n1ko1ay.myapplication

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

const val TAG= "MainActivity"

private const val HELLO_KEY = "hello"

class MainActivity : AppCompatActivity() {

    lateinit var nextActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivity = findViewById(R.id.next_activity_button)

        nextActivity.setOnClickListener {
            val secondActivityIntent:Intent = Intent(this, SecondActivity::class.java)

            secondActivityIntent.putExtra(HELLO_KEY, "Hello from MainActivity")

            startActivity(secondActivityIntent)
        }

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

