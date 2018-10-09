package com.abdulaziz.testgit.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abdulaziz.testgit.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun test (){
        Toast.makeText(this, "test 123 123", Toast.LENGTH_SHORT).show()
    }

}
