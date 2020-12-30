package com.aptech.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // remove top bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //add splash code
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                //before start activity write some code,
//
//                Intent i = new Intent(MainActivity.this, First.class);
//                startActivity(i);
//                // kill from stack
//                finish();
//            }
//        }, 2000);

    }
}