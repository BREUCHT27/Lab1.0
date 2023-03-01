package com.example.androidlesson

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity:AppCompatActivity() {
    class HelloActivity : AppCompatActivity() {
        private var mbutton: Button = findViewById(R.id.Helllobutton)
        private var mTextView: TextView = findViewById(R.id.helloText)
        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_hello)
            mbutton.setOnClickListener(){
                mTextView.visibility = View.VISIBLE
            }
        }
    }
}

