package com.android.lifecycle.fragments

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment
import com.kotlintuts.R

class MyDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = Dialog(requireContext(), R.style.FullScreenDialogTheme)
        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("Dialog Title")
            .setMessage("This is an example dialog fragment.")
            .setPositiveButton("OK") { dialog: DialogInterface, which: Int ->
                // Positive button click logic
            }
            .setNegativeButton("Cancel") { dialog: DialogInterface, which: Int ->
                // Negative button click logic
            }

        return builder.create()
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyDialogFragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyDialogFragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyDialogFragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyDialogFragment", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("MyDialogFragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyDialogFragment", "onDestroy")
    }

}