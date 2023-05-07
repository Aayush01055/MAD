package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    Button btntime,btndate;
    DatePicker dpDate;
    TimePicker tptime;

    int Total=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dpDate=findViewById(R.id.dpDate);
        tptime=findViewById(R.id.tptime);
        btntime=findViewById(R.id.btntime);
        btndate=findViewById(R.id.btnDate);



        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String strTime=tptime.getHour() + ":" + tptime.getMinute();
                Toast.makeText(getApplicationContext(),strTime,Toast.LENGTH_LONG).show();
            }
        });

        btndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String strDate=dpDate.getDayOfMonth() + "/" + dpDate.getMonth() + "/" + dpDate.getYear();
                Toast.makeText(getApplicationContext(),strDate,Toast.LENGTH_LONG).show();
            }
        });
    }
}