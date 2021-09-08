package com.operators

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

class JustDemo : AppCompatActivity() {
    lateinit var disposable: Disposable
    val TAG: String? = JustDemo::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intArray = intArrayOf(1, 2, 3, 4)
        Observable.fromArray(1,2,3)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { Log.d(TAG, "$it") }
            .also { disposable = it }

    }

    override fun onDestroy() {
        super.onDestroy()
        disposable.dispose()

    }
}