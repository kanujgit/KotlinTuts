package com.kdroid.kotlintuts.kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class DemoActivity : AppCompatActivity() {

    private val TAG = DemoActivity::class.java.canonicalName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onRetainCustomNonConfigurationInstance(): Any? {
        Log.d(TAG, "onRetainCustomNonConfigurationInstance() called")
        return super.onRetainCustomNonConfigurationInstance()
    }


    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onStop() {
        super.onStop()
    }
}