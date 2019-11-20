package com.tjoeun.a191120_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tjoeun.a191120_01.datas.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ArrayList 생성하기
        var userList = ArrayList<User>()

        // 사용자 목록 추가
        userList.add(User("신정식","경기도 성남시"))
        userList.add(User("조경진","서울시 은평구"))
        userList.add(User("구민성","경기도 양주시"))
        userList.add(0, User("임동균","인천광역시"))

        // 들어있는 사용자들을 로그로 출력
        for (user in userList) {
            Log.d("사용자변수", "${user.name} / ${user.address}")
        }

        // 직접 데이터 빼내기
        Log.d("직접빼내기", userList.get(1).name)

        // 들어있는 사용자의 수?
        Log.d("사용자수", userList.size.toString())

        // 신정식은 몇번째 위치에 들어있을까?
        Log.d("신정식의 위치", "${userList.indexOf(User("신정식", "경기도 성남시"))}")

        // -1 리턴 : 그런거 없다.

        // 조경진을 지우는 방법
//        userList.remove(User("조경진", "서울시 은평구"))
//        userList.removeAt(2)

        userList.clear()
        Log.d("남은사용자수", "${userList.size} 명")

        for (user in userList) {
            Log.d("사용자변수", "${user.name} / ${user.address}")
        }

    }
}
