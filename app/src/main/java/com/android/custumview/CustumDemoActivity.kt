package com.android.custumview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlintuts.R


class CustumDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custum_demo)
//        val shapeSelectorView = findViewById<ShapeSelectorView>(R.id.shape_selector)
//        findViewById<Button>(R.id.btnSelect).setOnClickListener {
//            Toast.makeText(
//                this@CustumDemoActivity, "You selected: " +
//                        shapeSelectorView.getSelectedShape(), Toast.LENGTH_LONG
//            ).show()
//        }


    }
}