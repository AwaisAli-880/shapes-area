package com.naaz.realwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Circle,Square,Rectangle,Triangle;
        Square=findViewById(R.id.Square);
        Rectangle=findViewById(R.id.Rectangle);
        Triangle=findViewById(R.id.triangle);
        Circle=findViewById(R.id.Circle);
        Square.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),squareActivity.class);
            startActivity(intent);
        });
        Rectangle.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),rectangleActivity.class);
            startActivity(intent);
        });
        Triangle.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),triangleActivity.class);
            startActivity(intent);
        });
        Circle.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),circleActivity.class);
            startActivity(intent);
        });
    }
}