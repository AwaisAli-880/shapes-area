package com.naaz.realwork;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class rectangleActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangle);
        Button calculate,clear;
        EditText width;
        EditText height;
        TextView answer;
        calculate=findViewById(R.id.button);
        clear=findViewById(R.id.button2);
        width=findViewById(R.id.editTextNumber2);
        answer=findViewById(R.id.textView6);
        height=findViewById(R.id.editTextNumber);
        clear.setOnClickListener(v -> {
            width.setText("");
            height.setText("");
            answer.setText("");
        });
        calculate.setOnClickListener(v -> {
            if((width.getText().toString().isEmpty())||(height.getText().toString().isEmpty()))
            {
                answer.setText("Please Enter some number!");
            }
            else
            {
                double l = Double.parseDouble(width.getText().toString());
                double h = Double.parseDouble(height.getText().toString());
                double ans=l*h;
                answer.setText("Area =  "+ans);
            }

        });
    }
}
