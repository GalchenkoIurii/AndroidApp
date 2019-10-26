package com.example.testapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  { //implements View.OnClickListener

//    public boolean isStart = true;
//    public double firstOperand = 0;
//    public TextView tv;
//    public string mode = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);

//        Button btn1 = (Button)findViewById(R.id.button);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TextView tv = (TextView)findViewById(R.id.textView);
//                tv.setText("click2!");
//            }
//        });



        Button btn7 = (Button)findViewById(R.id.button);
        Button btn8 = (Button)findViewById(R.id.button2);
        Button btn9 = (Button)findViewById(R.id.button3);
        Button btn4 = (Button)findViewById(R.id.button6);
        Button btn5 = (Button)findViewById(R.id.button7);
        Button btn6 = (Button)findViewById(R.id.button8);
        Button btn1 = (Button)findViewById(R.id.button11);
        Button btn2 = (Button)findViewById(R.id.button12);
        Button btn3 = (Button)findViewById(R.id.button13);
        Button btn0 = (Button)findViewById(R.id.button17);

//
//        btn1.setOnClickListener(this);
//        btn2.setOnClickListener(this);

        btn7.setOnClickListener(digitKey);
        btn8.setOnClickListener(digitKey);
        btn9.setOnClickListener(digitKey);
        btn4.setOnClickListener(digitKey);
        btn5.setOnClickListener(digitKey);
        btn6.setOnClickListener(digitKey);
        btn1.setOnClickListener(digitKey);
        btn2.setOnClickListener(digitKey);
        btn3.setOnClickListener(digitKey);
        btn0.setOnClickListener(digitKey);
    }

    public View.OnClickListener digitKey = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView tv = (TextView)findViewById(R.id.textView);
            Button btn = (Button) v;
            tv.setText(btn.getText());


            // 1.    if(isStart) {
//        tv.setText('');
//        isStart = false;
//    }

//    Button b = (Button)v;
//    tv.setText(tv.getText() + b.getText());


        }
    };

    public View.OnClickListener operationKey = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }

// 2.       firstOperand = Double.parseDouble(tv.getText());
//        tv.setText("0");
//        isStart = true;
//        mode = (Button)v.getText();  //  + - * /

    };


    // 3. handling pressing button C

    // tv.setText(0);
    // isStart = true;


    // 4. handling pressing button =

    // double c = 0;
    // double b = Double.parseDouble(tv.getText());
    // if(mode.equals("+")) c = firstOperand + b;
    // else if(mode.equals("-")) c = firstOperand - b;
    // e.t.c.

    // tv.setText(c.toString());



//    @Override
//    public void onClick(View v) {
//        Button btn = (Button)v;
//        TextView tv = (TextView)findViewById(R.id.textView);
//
//        switch(v.getId()){
//            case R.id.button:
////                TextView tv = (TextView)findViewById(R.id.textView);
////                Button btn = (Button)v;
//                tv.setText(btn.getText());
//                break;
//
//            case R.id.button2:
//                tv.setText(btn.getText());
//                break;
//        }
//    }



//    public void onBtnClick(View v) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        tv.setText("click!");
//
//    }
}
