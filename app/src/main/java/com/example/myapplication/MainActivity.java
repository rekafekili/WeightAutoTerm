package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 *  Toy Project : WeightAutoTerm
 *  웨이트 운동을 할 때 필요한 1분 휴식 시간을 자동으로 타이머 설정해주는 어플리케이션
 *  @author rekafekili
 *  created on 2020. 02. 05....
 */
public class MainActivity extends AppCompatActivity {

    // TODO : 잠금화면 해제 인식
    // TODO : 타이머 기능
    // TODO : Notification을 통해 타이머 제어 가능
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
