package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rb1,rb2,rg1; //radiobutton object
    RadioGroup rg; //radiogroup object
    Button btnShow; //Button object

    String msg="You Checked ";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rg=findViewById(R.id.rg);
        btnShow=findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rg1=findViewById(rg.getCheckedRadioButtonId());

                if(rb1.isChecked()){
                    msg=msg+rb1.getText() + " ";
                }

                if(rb2.isChecked()){
                    msg=msg+rb2.getText() + " ";
                }

                if(rg1.isChecked()){
                    msg=msg+rg1.getText();
                }

                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
            }
        });
    }
}