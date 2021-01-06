package com.example.studywithme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //앱이 최초 실행되면 이곳을 수행한다.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_getText.setOnClickListener{
            var resultText = et_id.text.toString()
            tv_result.setText(resultText)


        }

    }
}