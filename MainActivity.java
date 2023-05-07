package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressDialog progressDialog;
    Button btnShow;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow=findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog=new ProgressDialog(MainActivity.this);
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog.setTitle("Downloading...");


                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int progress=0;
                        try {
                            while(progress<=100) {
                                progressDialog.setProgress(progress);
                                progress++;
                                Thread.sleep(200);
                            }
                        }
                        catch (Exception ex){}

                    }
                });
                t.start();
                progressDialog.show();
            }
        });

    }
}