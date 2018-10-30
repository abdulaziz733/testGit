package com.abdulaziz.testgit.fa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abdulaziz.testgit.R

class FaActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fa)
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show()
    }
}
