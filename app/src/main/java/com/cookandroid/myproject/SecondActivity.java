package com.cookandroid.myproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {

    Button btn;               //버튼 객체를 생성.
    EditText ed, ed1, ed2;     //입력창 객체를 생성.
    TextView text, text1;       //텍스트뷰 객체를 생성.

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        init();                    //초기화 함수 호출.
    }

    void init() {
        ed = (EditText) findViewById(R.id.editText7);
        ed1 = (EditText) findViewById(R.id.editText8);
        ed2 = (EditText) findViewById(R.id.editText10);
        btn = (Button) findViewById(R.id.button8);
        text = (TextView) findViewById(R.id.textView11);
        text1 = (TextView) findViewById(R.id.textView13);
        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String adult = ed.getText().toString();
                String teen = ed1.getText().toString();
                String special = ed2.getText().toString();
                //입력창에 입력된 값을 받아서 변수에 저장.

                int adultCount, teenCount, specialCount;


                if (adult.getBytes().length == 0) {
                    adultCount = 0;
                } else {
                    adultCount = Integer.parseInt(adult);
                }
                if (teen.getBytes().length == 0) {
                    teenCount = 0;
                } else {
                    teenCount = Integer.parseInt(teen);
                }
                if (special.getBytes().length == 0) {
                    specialCount = 0;
                } else {
                    specialCount = Integer.parseInt(special);
                }

                int count = adultCount + teenCount + specialCount;
                //입력된 메뉴 개수를 모두 더합니다.
                double result = (adultCount * 11000) +
                        (teenCount * 9000) +
                        (specialCount * 5000);

                text.setText(String.valueOf(count + "명"));
                text1.setText(String.valueOf((int) result + "원"));



                btnReturn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        finish();
                    }
                });


            }
        });

    }
}
