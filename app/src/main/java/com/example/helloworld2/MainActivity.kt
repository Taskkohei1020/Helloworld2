package com.example.helloworld2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            greetingText.text = getString(R.string.good_morning_text)
        }
        button2.setOnClickListener {
            greetingText.text = getString(R.string.good_afternoon_text)
        }
        button3.setOnClickListener {
            greetingText.text = getString(R.string.good_evening_text)
        }
    }
}
