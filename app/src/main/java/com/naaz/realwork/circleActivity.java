package com.naaz.realwork;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class circleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle);
        Button calculate,clear;
        EditText raduis;
        TextView answer;
        calculate =findViewById(R.id.button);
        clear=findViewById(R.id.button2);
        raduis=findViewById(R.id.editTextNumber);
        answer=findViewById(R.id.textView6);
        clear.setOnClickListener(v -> {
            raduis.setText("");
            answer.setText("");
        });
        calculate.setOnClickListener(v -> {
            if((raduis.getText().toString().isEmpty()))
            {
                answer.setText("Please Enter some number");
            }
            else
            {
                double r = Double.parseDouble(raduis.getText().toString());
                double ans=(22.0/7.0)*(r*r);
                answer.setText("Area  =  "+ans);
            }

        });
    }
}
