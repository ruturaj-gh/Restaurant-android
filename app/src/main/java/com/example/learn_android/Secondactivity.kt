package com.example.learn_android
import com.example.learn_android.MainActivity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_second.*

class Secondactivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_second)

        buttonback.setOnClickListener {
            finish();
            super.onBackPressed();
        }


    }
}