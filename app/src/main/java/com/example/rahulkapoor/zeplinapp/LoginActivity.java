package com.example.rahulkapoor.zeplinapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;
    private static int REQUEST_CODE = 5;
    private Button btnLogin;
    private Button btnSignup;
    private String mEmail;
    private String mPassword;
    private Intent mintent;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            btnLogin = (Button) findViewById(R.id.btn_login);
            btnSignup = (Button) findViewById(R.id.btn_signup);
            init();
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    btnLogin.setVisibility(View.VISIBLE);
                    btnSignup.setVisibility(View.VISIBLE);
                }
            }, SPLASH_TIME_OUT);

                btnLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mintent = new Intent(LoginActivity.this, IndexActivity.class);
                        startActivityForResult(mintent, REQUEST_CODE);
                        //Log.e("hello","world");
                    }
                });

            btnSignup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mintent = new Intent(LoginActivity.this, Signup.class);
                    startActivity(mintent);
                }
            });



        }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       // Log.e("hello","world3");
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK) {
            Intent i = new Intent();
            mEmail = i.getStringExtra("Email");
            mPassword = i.getStringExtra("Password");

            if (isValidEmail(mEmail) && mPassword!=null) {
                  // Intent intent = new Intent(LoginActivity.this, SideMenu.class);
                    //startActivity(intent);

            }
            else{
                Toast.makeText(LoginActivity.this, "login with correct details", Toast.LENGTH_LONG).show();
            }

        }

    }

    private void init(){
            btnLogin.setVisibility(View.GONE);
            btnSignup.setVisibility(View.GONE);

        }

    private boolean isValidEmail(final String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }



    }
