package com.rxandorid.rxsyntax

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.functions.Function

class RxSyntaxActivity : AppCompatActivity() {

    val TAG = RxSyntaxActivity::class.java.canonicalName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init(){
        map()
    }
    private fun map(){
        Observable.just(1,2,3,4,5)
            .map(object : Function<Int,Int>{
                override fun apply(t: Int): Int {
                    return t*3
                }
            }).subscribe(
                {
                    Log.i(TAG, "map: $it")
                }
            )
    }
}