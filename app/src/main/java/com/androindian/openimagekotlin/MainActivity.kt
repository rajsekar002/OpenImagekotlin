package com.androindian.openimagekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openimge.setOnClickListener {
            var intent=Intent(Intent.ACTION_GET_CONTENT)
            intent.setType("image/*")
            startActivity(intent)
        }
    }
}
