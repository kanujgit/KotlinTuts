package com.android.lifecycle.activity

import android.Manifest
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.android.lifecycle.fragments.MyDialogFragment
import com.kotlintuts.databinding.Activity1Binding


class Activity1 : AppCompatActivity() {

    val TAG: String = "Activity1"
    lateinit var binding: Activity1Binding

    private val PERMISSION_REQUEST_CODE = 123


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
        binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {

            launchDialogueFragment()
//            val intent = Intent(this, Activity2::class.java)
//            startActivity(intent)
            //showAlertDialog()
            //launchDialogueFragment()
//            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
//                != PackageManager.PERMISSION_GRANTED
//            ) {
//                requestCameraPermission()
//            }
        }

//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
//            != PackageManager.PERMISSION_GRANTED
//        ) {
//            requestCameraPermission()
//        }
    }


    private fun requestCameraPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(
                this,
                Manifest.permission.CAMERA
            )
        ) {
            // Display explanation dialog before requesting permission
            showPermissionExplanationDialog()
        } else {
            // Directly request the permission
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.CAMERA),
                PERMISSION_REQUEST_CODE
            )
        }
    }

    private fun showPermissionExplanationDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Permission Request")
            .setMessage("This app requires camera access to function properly.")
            .setPositiveButton("OK") { dialog: DialogInterface, which: Int ->
                // Request the permission after the user acknowledges the explanation
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.CAMERA),
                    PERMISSION_REQUEST_CODE
                )
            }
            .setNegativeButton("Cancel") { dialog: DialogInterface, which: Int ->
                // Handle the cancellation or show an error message
            }
            .setCancelable(false)
            .show()
    }

    // Handle the permission request result
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, handle the functionality
            } else {
                // Permission denied, handle accordingly
            }
        }
    }

    private fun launchDialogueFragment() {
        val dialogFragment = MyDialogFragment()
        dialogFragment.show(supportFragmentManager, "MyDialogFragment")

    }

    private fun showAlertDialog() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle("Alert")
            .setMessage("This is an example alert dialog.")
            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
            })
            .setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->
                // Negative button click logic
            })
        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState:")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")

    }
}