package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();

    EditText txtUsername,txtpass;
    Button btnlogin;
    @SuppressLint("MissingInflatedId")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername=findViewById(R.id.txtUsername);
        txtpass=findViewById(R.id.txtpass);

        btnlogin=findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String User=txtUsername.getText().toString();
               String Pass=txtpass.getText().toString();

               if(User.equals("Admin") && Pass.equals("Admin")){
                   Toast.makeText(getApplicationContext(),"Valid Login",Toast.LENGTH_LONG).show();
               }
               else{
                   Toast.makeText(getApplicationContext(),"Invalid Login",Toast.LENGTH_LONG).show();
               }

            }
        });
    }
}