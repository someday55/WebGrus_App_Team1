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

        loadData()

    }

    fun loadData() {
        val pref = getSharedPreferences("pref", 0)
        et_hello.setText(pref.getString("name", "")) //1번째 인자에는 저장할 당시의 키 값을 작성, 2번째는 데이터가 존재하지 않을 경우 대체 값 작성
    }


    fun saveData() {
        val pref = getSharedPreferences("pref", 0)
        val edit = pref.edit() //수정모드
        edit.putString("name", et_hello.text.toString()) //1번째 인자에는 키 값, 2번째 인자에는 실제 담아둘 값
        edit.apply()
    }


    override fun onDestroy() { //앱이 종료되는 시점이 다가올 때 호출
        super.onDestroy()

        saveData()
    }
}