package com.example.viewmodel

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    lateinit var txtCounter: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mainViewModel =
            ViewModelProvider(this, MainViewModelFactory(10)).get(MainViewModel::class.java)
        txtCounter = findViewById(R.id.textView)
        setText()


    }

    private fun setText() {
        txtCounter.text = mainViewModel.count.toString()
    }


    fun increment(view: View) {
        mainViewModel.count++
        setText()

    }


}