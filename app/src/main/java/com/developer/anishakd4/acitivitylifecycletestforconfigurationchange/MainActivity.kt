package com.developer.anishakd4.acitivitylifecycletestforconfigurationchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity: ", "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity: ", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity: ", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity: ", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity: ", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity: ", "onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity: ", "onRestart called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("MainActivity: ", "onRestoreInstanceState called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("MainActivity: ", "onSaveInstanceState called")
    }
}
