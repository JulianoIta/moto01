package com.example.motoboys01.ui.login;

import android.app.Activity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.motoboys01.MainActivity;
import com.example.motoboys01.R;
import com.example.motoboys01.Splash;
import com.example.motoboys01.motoTela;
import com.example.motoboys01.ui.login.LoginViewModel;
import com.example.motoboys01.ui.login.LoginViewModelFactory;

public class LoginActivity extends AppCompatActivity {



    @Override
    public void onCreate ( Bundle savedInstanceState ) {
        getSupportActionBar();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginM = (Button)findViewById(R.id.loginM);
        loginM.setOnClickListener(new View.OnClickListener() {

                    @Override
                        public void onClick (View view){
                    Intent intent = new Intent(LoginActivity.this, motoTela.class);
                    startActivity(intent);
                }

        });


    }
}
