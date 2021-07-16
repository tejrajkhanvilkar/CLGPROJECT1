package com.example.clgproject1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    Button Create_account;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regestration_activity);
             init();
             Create_account.setOnClickListener(new CreateonclickListener());


    }


    void init(){
        Create_account = findViewById(R.id.create_account);
    }


    private  class CreateonclickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(RegistrationActivity.this,LoginActivity.class);
            startActivity(intent);
        }
    }


}
