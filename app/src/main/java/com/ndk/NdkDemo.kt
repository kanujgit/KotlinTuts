package com.ndk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlintuts.databinding.NdkLayoutBinding

class NdkDemo : AppCompatActivity() {
    lateinit var binding: NdkLayoutBinding

    companion object {
        init {
            System.loadLibrary("native-lib");
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NdkLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.text = "default text: ${stringToJni()}" +
                "\n addition =${add(2, 3)}" +
                "\n sub =${sub(2, 3)}" +
                "\nmultiply =${multiply(2, 3)}" +
                "\n div =${divide(2, 2)}"


    }

    private external fun stringToJni(): String
    external fun add(x: Int, y: Int): Int
    external fun sub(x: Int, y: Int): Int
    external fun multiply(x: Int, y: Int): Int
    external fun divide(x: Int, y: Int): Int

}