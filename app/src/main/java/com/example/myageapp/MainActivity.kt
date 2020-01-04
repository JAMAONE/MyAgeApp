package com.example.myageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        btnAge.setOnClickListener{
            val userDOB: Int = eTxt.text.toString().toInt()
            val currentYear: Int=Calendar.getInstance().get(Calendar.YEAR)
            val myAge: Int=currentYear-userDOB
            txtV.setText("Your age is $myAge ")
        }




    }
}
