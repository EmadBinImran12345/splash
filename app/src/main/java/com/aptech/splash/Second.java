package com.aptech.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Second extends AppCompatActivity {

    TextView name, email;
    String n, e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);

        //get data from SharedPrefrences
        SharedPreferences sp = getApplicationContext().getSharedPreferences("userPref", MODE_PRIVATE);

        n = sp.getString("name", "");
        e = sp.getString("email", "");

        name.setText(n);
        email.setText(e);

    }
}