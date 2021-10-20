package com.android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class DemoViewModelFactory(private val getContacts: String) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DemoViewModel::class.java)) {
            return DemoViewModel(getContacts) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}