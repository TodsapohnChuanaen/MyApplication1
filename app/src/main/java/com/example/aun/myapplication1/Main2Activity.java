package com.example.aun.myapplication1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences sharedPreferences = getSharedPreferences("aun",Context.MODE_PRIVATE);
        String yourname = sharedPreferences.getString("name","");

        Intent intent = getIntent();
        String name = intent.getStringExtra("yourName");

        intent = getIntent();
        String nickname = intent.getStringExtra("yourNickname");

        intent = getIntent();
        String ID = intent.getStringExtra("yourID");

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);

        textView2.setText(name);
        textView3.setText(nickname);
        textView4.setText(ID);

    }

}
