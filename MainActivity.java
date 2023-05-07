package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnShow;
    CheckBox chk1,chk2,chk3;

    String msg=" "+"\n";

    int pizza=30;
    int burger=40;
    int Sandwhich=60;

    int Total=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow=findViewById(R.id.btnShow);
        chk1=findViewById(R.id.chk1);
        chk2=findViewById(R.id.chk2);
        chk3=findViewById(R.id.chk3);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chk1.isChecked()){

                    msg=msg+chk1.getText() +" = "+ pizza +"\n";
                    Total=Total+pizza;
                }
                if(chk2.isChecked()){
                    msg=msg+chk2.getText() +" = "+ burger +"\n";
                    Total=Total+burger;
                }
                if(chk3.isChecked()){
                    msg=msg+chk3.getText() +" = "+ Sandwhich +"\n";
                    Total=Total+Sandwhich;
                }

                Toast.makeText(getApplicationContext(),"\n"+"Items= "+msg+"\n"+"Total= "+Total,Toast.LENGTH_LONG).show();
            }
        });

    }
}