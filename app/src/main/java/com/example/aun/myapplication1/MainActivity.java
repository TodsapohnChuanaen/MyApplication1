package com.example.aun.myapplication1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String yourName;
    String yourNickname;
    String yourID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button = (Button) findViewById(R.id.button);


        SharedPreferences sharedPreferences = getSharedPreferences("aun", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name","bun");
        editor.putInt("idName",12);
        editor.commit();

    }

    public void sendData(View view){
        EditText edittextName = (EditText) findViewById(R.id.editText);
        yourName = edittextName.getText().toString();

        EditText edittextNickname = (EditText) findViewById(R.id.editText2);
        yourNickname = edittextNickname.getText().toString();

        EditText edittextID = (EditText) findViewById(R.id.editText3);
        yourID = edittextID.getText().toString();


        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("yourName",yourName);
        intent.putExtra("yourNickname",yourNickname);
        intent.putExtra("yourID",yourID);




        startActivity(intent);
    }
}
