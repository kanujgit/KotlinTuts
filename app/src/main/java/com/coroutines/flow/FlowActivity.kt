package com.coroutines.flow

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.kotlintuts.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class FlowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow)

//        val job = GlobalScope.launch {
//            produces().collect { Log.d("FLow1", " collect ${it.toString()}") }
//
//        }

        GlobalScope.launch {
            val job1 = produces()
            delay(3000L)
            job1.collect { Log.d("FLow2", " collect ${it.toString()}") }

        }

//        val job3 = GlobalScope.launch {
//            producesOnSharedFlow().collect { Log.d("FLowShared1", " collect ${it.toString()}") }
//
//        }

        GlobalScope.launch {
            val job4 = producesOnSharedFlow()
            delay(4000L)
            job4.collect { Log.d("FLowShared2", " collect ${it.toString()}") }

        }

        GlobalScope.launch {
            val job5 = producesOnStateFlow()
            delay(10000L)
            job5.collect { Log.d("FLowShared4", " collect ${it.toString()}") }

        }
    }

    private fun produces() = flow<Int> {
        val list = listOf(1, 2, 3, 4, 5, 6)
        list.forEach {
            delay(1000)
            emit(it)
        }
    }

    private fun producesOnSharedFlow(): Flow<Int> {
        val mutableSharedFlow = MutableSharedFlow<Int>(4)
        GlobalScope.launch {
            val list = listOf(1, 2, 3, 4, 5, 6)
            list.forEach {
                mutableSharedFlow.emit(it)
                delay(1000)
            }
        }
        return mutableSharedFlow
    }


    private fun producesOnStateFlow(): Flow<Int> {
        val mutMutableStateFlow = MutableStateFlow(0)
        GlobalScope.launch {
            val list = listOf(1, 2, 3, 4, 5, 6)
            list.forEach {
                mutMutableStateFlow.emit(it)
                delay(1000)
            }
        }
        return mutMutableStateFlow
    }


}