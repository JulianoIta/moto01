package com.example.motoboys01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.motoboys01.ui.login.LoginActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //para esconder as barras
        getSupportActionBar();
        // para ficar fullscreem
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {
            startActivity(new Intent(getBaseContext(), LoginActivity.class));
            finish();
            }
        } ,5000);
    }
}
