package com.example.viewsapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CalendarioActivity extends AppCompatActivity {
    CalendarView calendarView;
    TextView myDate;
    String date;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendario_activity);
        calendarView = findViewById(R.id.calendarView);
        myDate  = (TextView) findViewById(R.id.txtDate);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {

                date = (i2) + "/" + (i1 + 1) + "/" + i;
                myDate.setText("Fecha seleccionada:" + date);
            }
        });

    }

    public void regresarClick( View v ) {
        Log.d("Hola","fecha seleccionada: " + date);
        Toast.makeText( calendarView.getContext(),"Ultima fecha seleccionada: " + date,Toast.LENGTH_LONG).show();
        finish();
    }
}
