package com.aptech.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class First extends AppCompatActivity {

    EditText et1, et2;
    Button btn1, btn2;
    String name, email;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        et1 = findViewById(R.id.name);
        et2 = findViewById(R.id.email);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        sp = getSharedPreferences("userPref", MODE_PRIVATE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = et1.getText().toString();
                email = et2.getText().toString();

                SharedPreferences.Editor editor = sp.edit();
                editor.putString("name", name);
                editor.putString("email", email);
                editor.commit();

                Toast.makeText(First.this, "Data has been saved", Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(First.this, Second.class);
                startActivity(i);
            }
        });
    }
}