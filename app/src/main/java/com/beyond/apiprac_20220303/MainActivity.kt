package com.beyond.apiprac_20220303

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.beyond.apiprac_20220303.Util.ServerUtil
import com.beyond.apiprac_20220303.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
        binding =DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnLogin.setOnClickListener {

            val inputID = binding.edtID.text.toString()
            val inputPW = binding.edtPassword.text.toString()

            //이제 이걸 api통신으로 주고받기할거임
            // RESTful API -> 이번에 통신할 거, REST API 스러운...서버
            // 한 대의 API서버에서는 여러가지 많은 기능이 필요
            // API서버는 따라서, 그 많은 기능들을 구별할 표시를 해줘야함
            // 앱에게 기능별로 주소 불러줌+ 그리로 와라
            //+ 어떤 메소드로 올건데? 로 구분하는 게 REST API
            //API : Application Programming Interface
            // 인풋 --로직--> 아웃풋 를 의미
            // API서버는 위에 걸 하는 서버






        }

    }
}