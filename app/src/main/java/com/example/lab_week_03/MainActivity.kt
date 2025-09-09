package com.example.lab_week_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// Removed enableEdgeToEdge as it's not standard and might not be defined
// import androidx.activity.enableEdgeToEdge 

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // If enableEdgeToEdge() is a custom or library extension function you use, 
        // ensure it's correctly defined or imported. For now, I'm commenting it out
        // to prevent potential compilation errors if it's not universally available.
        // enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.fragment_container)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
