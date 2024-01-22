package com.carlosdev.buttons

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    private lateinit var doMagic: Button
    private lateinit var myButton: Button
    private lateinit var myText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doMagic = findViewById(R.id.doMagic)
        myButton = findViewById(R.id.myButton)
        myText = findViewById(R.id.textExample)

        doMagic.setOnClickListener {
            doMagic.setBackgroundColor(Color.BLACK)
            myText.setText("I have done my magic.")
            myText.isVisible = false
            doMagic.isVisible = false
        }

        myButton.setOnClickListener {
            myText.isVisible = true
            doMagic.isVisible = true
        }
    }
}