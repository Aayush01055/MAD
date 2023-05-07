package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chk1,chk2,chk3,chk4,chk5;
    Button btnok;

    String msg;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk1=findViewById(R.id.chk1);
        chk2=findViewById(R.id.chk2);
        chk3=findViewById(R.id.chk3);
        chk4=findViewById(R.id.chk4);
        chk5=findViewById(R.id.chk5);

        btnok=findViewById(R.id.btnok);


        btnok.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                msg="";
                if (chk1.isChecked()){
                    msg=msg+chk1.getText();
                }

                if (chk2.isChecked()){
                    msg=msg+chk2.getText();
                }

                if (chk3.isChecked()){
                    msg=msg+chk3.getText();
                }

                if (chk4.isChecked()){
                    msg=msg+chk4.getText();
                }

                if (chk5.isChecked()){
                    msg=msg+chk5.getText();
                }

                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();

            }
        });
    }
}