package com.naaz.realwork;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class squareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle);
        Button calculate,clear;
        EditText length;
        TextView answer;
        calculate =findViewById(R.id.button);
        clear=findViewById(R.id.button2);
        length=findViewById(R.id.editTextNumber);
        answer=findViewById(R.id.textView6);
        clear.setOnClickListener(v -> {
            length.setText("");
            answer.setText("");
        });
        calculate.setOnClickListener(v -> {
            if((length.getText().toString().isEmpty()))
            {
                answer.setText("Please Enter some number");
            }
            else
            {
                double r = Double.parseDouble(length.getText().toString());
                double ans=(r*r);
                answer.setText("Area  =  "+ans);
            }

        });
    }
}
