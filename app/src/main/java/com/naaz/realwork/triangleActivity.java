package com.naaz.realwork;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class triangleActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangle);
        Button calculate,clear;
        EditText base;
        EditText height;
        TextView answer;
        calculate=findViewById(R.id.button);
        clear=findViewById(R.id.button2);
        base=findViewById(R.id.editTextNumber2);
        answer=findViewById(R.id.textView6);
        height=findViewById(R.id.editTextNumber);
        clear.setOnClickListener(v -> {
            base.setText("");
            height.setText("");
            answer.setText("");
        });
        calculate.setOnClickListener(v -> {
            if((base.getText().toString().isEmpty())||(height.getText().toString().isEmpty()))
            {
                answer.setText("Please Enter some number!");
            }
            else
            {
                double b = Double.parseDouble(base.getText().toString());
                double h = Double.parseDouble(height.getText().toString());
                double ans=0.5*(b*h);
                answer.setText("Area =  "+ans);
            }

        });
    }
}

