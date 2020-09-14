package com.example.appeval;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void gotoCalculateActivity(View v){
        Intent i = new Intent(this,CalculateActivity.class);
        startActivity(i);
    }

    public void gotoTimeActivity(View v){
        Intent i = new Intent(this,TimeActivity.class);
        startActivity(i);
    }


}
