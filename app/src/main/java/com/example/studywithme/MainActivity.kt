package com.example.studywithme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //앱이 최초 실행되면 이곳을 수행한다.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toast.setOnClickListener{

            iv_profile.setImageResource(R.drawable.robot)

            Toast.makeText(this@MainActivity, "버튼이 클릭 되었습니다", Toast.LENGTH_LONG).show()
        }

    }
}