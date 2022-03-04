package com.beyond.apiprac_20220303.Util

class ServerUtil {


    // 서버의 리퀘스트를 날리는 것을 모아두는 역할
    // 메소드(함수)를 만들려고 하는데, 어떤 객체가 실행해도 결과는 같을 함수를!
    // 자바의 static 해당 개념의 코딩 - companion object{}

    companion object{
        private val Base_urlString = "http://54.180.52.26"
        // 다른데서 안보이게 private

        
        fun postRequestLogin(id:String, pw: String){
            // 이름 지을 때, 어디에 / 무엇을 /어떻게

            //리퀘스트 제작 -> 실제 호출 -> 서버의 응답을 화면에 전달

            // step 1). 어느 주소(url)에 접근할지를 변수에 담기
            // if 서버 주소 몇 안되면, 멤버변수로 선언해라
            val urlString = "${Base_urlString}/user"

        }

    }

}