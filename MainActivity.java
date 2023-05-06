package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtname,txtage,txtaddress,txtroll,txtclass;
    Button btnsave;

    String msg;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtname=findViewById(R.id.txtname);
        txtage=findViewById(R.id.txtage);
        txtaddress=findViewById(R.id.txtaddress);
        txtroll=findViewById(R.id.txtroll);
        txtclass=findViewById(R.id.txtclass);
        btnsave=findViewById(R.id.btnsave);



        btnsave.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                msg="Name= "+txtname.getText() + " \n" + "Age= "+ txtage.getText() + "\n" + "Address= "+ txtaddress.getText() + "\n" + "Roll No. = " + txtroll.getText() +"\n" + "Class= "+ txtclass.getText();
                Toast.makeText(getApplicationContext(),msg.toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}