package com.example.prismwood;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class splashScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */


                Intent mainIntent = new Intent(splashScreen.this,MainActivity.class);
                splashScreen.this.startActivity(mainIntent);
                splashScreen.this.finish();

            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}