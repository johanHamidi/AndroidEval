package com.example.appeval;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeActivity extends AppCompatActivity {

    public TextView month;
    public TextView day;
    public TextView year;
    public TextView time;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        month = findViewById(R.id.month);
        day = findViewById(R.id.day);
        year = findViewById(R.id.year);
        time = findViewById(R.id.time);

        Date currentTime = Calendar.getInstance().getTime();
        String DateFormatter = DateFormat.getDateInstance(DateFormat.FULL).format(currentTime);

        //Découper chaine de caractère
        String[] splitDate = DateFormatter.split(",");

        //Récuperer heure
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = df.format(currentTime.getTime());


        day.setText(splitDate[0]);
        month.setText(splitDate[1]);
        year.setText(splitDate[2]);
        time.setText(formattedTime);

    }
}
