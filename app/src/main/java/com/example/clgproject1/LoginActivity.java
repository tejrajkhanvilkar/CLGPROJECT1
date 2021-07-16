package com.example.clgproject1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    TextView Sign_up;
    Button Login_In;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_acitivity);
        init();
        Login_In.setOnClickListener(new LoginButtononclicklistener());
        Sign_up.setOnClickListener(new Signupclicklistener());


    }

    void  init(){
        Login_In = findViewById(R.id.login_button);
        Sign_up = findViewById(R.id.sign_up);
    }

     private class LoginButtononclicklistener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
            startActivity(intent);
        }
    }

    private class Signupclicklistener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(LoginActivity.this,RegistrationActivity.class);
            startActivity(intent);
        }
    }

}
