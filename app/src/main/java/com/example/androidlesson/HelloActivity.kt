package com.example.androidlesson

import android.os.Bundle
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class HelloActivity : AppCompatActivity() {
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        val mbutton = findViewById<Button>(R.id.Helllobutton);
        val mText = findViewById<TextView>(R.id.helloText);
        val meditText = findViewById<TextView>(R.id.editText);
        mbutton.setOnClickListener(){
                mText.text = meditText.text.toString();
            }
        }
    }



