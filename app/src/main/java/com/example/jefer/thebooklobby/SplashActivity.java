package com.example.jefer.thebooklobby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by Jeff on 10/20/2017.
 * got help with splash on Big Nerd Ranch
 * https://www.bignerdranch.com/blog/splash-screens-the-right-way/
 */
public class SplashActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Start main activity

        startActivity(new Intent(SplashActivity.this, MainActivity.class));

        // close splash activity

        finish();

    }

}
