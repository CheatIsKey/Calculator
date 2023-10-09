package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button plus, minus, multiply, division;
    TextView text;
    String input1, input2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.cal);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        division = (Button) findViewById(R.id.division);
        text = (TextView) findViewById(R.id.text);

        plus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                input1 = num1.getText().toString();
                input2 = num2.getText().toString();
                result = Integer.parseInt(input1) + Integer.parseInt(input2);
                text.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

        minus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                input1 = num1.getText().toString();
                input2 = num2.getText().toString();
                result = Integer.parseInt(input1) - Integer.parseInt(input2);
                text.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

        multiply.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                input1 = num1.getText().toString();
                input2 = num2.getText().toString();
                result = Integer.parseInt(input1) * Integer.parseInt(input2);
                text.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

        division.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                input1 = num1.getText().toString();
                input2 = num2.getText().toString();
                result = Integer.parseInt(input1) / Integer.parseInt(input2);
                text.setText("계산 결과 : " + result.toString());
                return false;
            }
        });


    }
}