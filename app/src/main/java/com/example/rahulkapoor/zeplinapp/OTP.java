package com.example.rahulkapoor.zeplinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OTP extends AppCompatActivity {

    private TextView mresendotp;
    private TextView mchangenumber;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        mresendotp = (TextView) findViewById(R.id.tv_otp_resend_otp);
        mchangenumber = (TextView) findViewById(R.id.tv_otp_change_number);

        mresendotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        mchangenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              intent = new Intent(OTP.this, ForgotPassword.class);
                startActivity(intent);

            }
        });


    }
}
