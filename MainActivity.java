package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
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
    private static final int REQUEST_IMAGE_CAPTURE = 1;

    ImageView img1;
    Button btncapture;



    @SuppressLint("MissingInflatedId")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1=findViewById(R.id.img1);
        btncapture=findViewById(R.id.btncapture);

        btncapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchTakePicture();
            }
        });
    }

    public void dispatchTakePicture(){
        Intent takepicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(takepicture,REQUEST_IMAGE_CAPTURE);

    }

    public void onActivityResult(int RequestCode,int ResultCode,Intent Data){
        if(RequestCode==REQUEST_IMAGE_CAPTURE && ResultCode==RESULT_OK){
            Bundle extras = Data.getExtras();
            Bitmap imageBitmap=(Bitmap) extras.get("data");
            img1.setImageBitmap(imageBitmap);
        }
    }
}