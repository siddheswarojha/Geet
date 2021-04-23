package com.siddheswar.geet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread th = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(1100);
                    Intent i = new Intent(Splash_Activity.this, DashBoard.class);
                    startActivity(i);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        };
        th.start();

    }
}