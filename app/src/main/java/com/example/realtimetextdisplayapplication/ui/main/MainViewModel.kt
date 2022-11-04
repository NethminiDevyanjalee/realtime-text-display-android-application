package com.example.realtimetextdisplayapplication.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _message = MutableLiveData<String>().apply {
        value = ""
    }

    val message: LiveData<String> get() = _message

    fun display(m: String) {
        _message.value = m
    }
}