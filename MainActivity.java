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

    EditText txturl;
    Button btnnavigate;
    @SuppressLint("MissingInflatedId")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txturl=findViewById(R.id.txturl);
        btnnavigate=findViewById(R.id.btnnavigate);

        btnnavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String url=txturl.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}