package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
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

    EditText txtmobile,txtmsg;
    Button btnsend;

    int count=0;
    @SuppressLint("MissingInflatedId")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtmobile=findViewById(R.id.txtmobile);
        txtmsg=findViewById(R.id.txtmsg);

        btnsend=findViewById(R.id.btnsend);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String phone=txtmobile.getText().toString();
               String msg=txtmsg.getText().toString();

                try{

                    SmsManager sms=SmsManager.getDefault();
                    sms.sendTextMessage(phone,null,msg,null,null);
                    Toast.makeText(getApplicationContext(),"Message Sent",Toast.LENGTH_LONG).show();

                }
                catch(Exception ex){
                    Toast.makeText(getApplicationContext(),"Message Unsent"+ ex,Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}