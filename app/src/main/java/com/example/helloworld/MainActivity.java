package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView tv_hello = findViewById(R.id.tv_hello);
//        tv_hello.setText("今天可太热了啊！！！");
//        tv_hello.setTextColor(Color.RED);
//        tv_hello.setTextSize(30);
//        tv_hello.setBackgroundColor(Color.GRAY);
//        tv_hello.setPadding(10,10,10,10);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, BbsActivity.class);
                startActivity(intent);

                return true;
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.helloworld.ACTION_START");
                intent.addCategory("com.example.helloworld.MY_CATEGORY");
                startActivity(intent);
            }
        });
    }
}