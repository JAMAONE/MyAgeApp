package com.example.myageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash_screen : AppCompatActivity() {

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_splash_screen)


                Handler().postDelayed({
                    startActivity(Intent(this@Splash_screen, MainActivity::class.java))  //activity intents from splash sreen to main activity
                    finish()
                }, 4000)  //4000 is in milli seconds


    }
}
