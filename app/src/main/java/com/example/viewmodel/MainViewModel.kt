package com.example.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModel(val initialValue:Int):ViewModel(){

    var count:Int = initialValue
    fun increment(){
        count++
    }

}