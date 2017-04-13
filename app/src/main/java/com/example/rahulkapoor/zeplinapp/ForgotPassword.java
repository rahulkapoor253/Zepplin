package com.example.rahulkapoor.zeplinapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ForgotPassword extends AppCompatActivity {

    private Button mbuttonclick;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        mbuttonclick = (Button) findViewById(R.id.btn_continue);

        mbuttonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              intent = new Intent(ForgotPassword.this, OTP.class);
                startActivity(intent);
            }
        });


    }
}
