package com.example.lab_week_03

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log // Keep this import for the existing Log calls

interface CoffeeListener {
    fun onSelected(id: Int)
}

class MainActivity : AppCompatActivity(), CoffeeListener {
    // Removed the old companion object with TAG as it's not in the new code snippet for MainActivity
    // If you still need Log calls elsewhere or a TAG, you'll need to re-add it.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v,
                                                                             insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right,
                systemBars.bottom)
            insets
        }
        // Log.d(TAG, "onCreate") // This would cause an error if TAG is not defined.
                                 // The provided code for MainActivity doesn't include Log calls or TAG.
    }

    // Removed onStart, onResume, onPause, onStop, onDestroy as they are not in the new snippet

    override fun onSelected(id: Int){
        val detailFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_detail) as? DetailFragment // Safe cast
        detailFragment?.setCoffeeData(id) // Call only if detailFragment is not null and is a DetailFragment
    }

    // If you had a companion object with a TAG for logging, it has been removed based on the
    // provided MainActivity code. If you still have Log.d calls from before, ensure TAG is defined
    // or remove those Log calls if they are no longer needed.
}