package com.cookandroid.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;
    TextView textResult;
    String num1, num2, zero="0";
    Integer result;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기(수정)");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnMod = (Button) findViewById(R.id.BtnMod);

        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"숫자를 입력하세요",Toast.LENGTH_LONG).show();
                }else {
                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.doubleValue());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"숫자를 입력하세요",Toast.LENGTH_LONG).show();
                }else {
                    result = Integer.parseInt(num1) - Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.doubleValue());
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"숫자를 입력하세요",Toast.LENGTH_LONG).show();
                }else {
                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.doubleValue());
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"숫자를 입력하세요",Toast.LENGTH_LONG).show();
                }else if(num2.equals(zero)) {
                    Toast.makeText(getApplicationContext(),"0으로는 나눌수 없습니다",Toast.LENGTH_LONG).show();
                } else {
                    result = Integer.parseInt(num1) / Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.doubleValue());
                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty()||num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"숫자를 입력하세요",Toast.LENGTH_LONG).show();
                }else if(num2.equals(zero)) {
                    Toast.makeText(getApplicationContext(),"0으로는 나눌수 없습니다",Toast.LENGTH_LONG).show();
                } else {
                    result = Integer.parseInt(num1) % Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.doubleValue());
                }
            }
        });
    }
}