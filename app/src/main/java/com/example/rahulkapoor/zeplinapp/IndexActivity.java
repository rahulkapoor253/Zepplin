package com.example.rahulkapoor.zeplinapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IndexActivity extends AppCompatActivity {

    private static int REQUEST_CODE = 5;
    private static int REQUEST_CODE_NEW = 5;
    private String Email;
    private TextView etEmail;
    private TextView etPassword;
    private String Password = null;
    private Button btnlogin;
    private Button btnsignup;
    private TextView forgotPass;
    private TextView goToSignup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        etEmail = (EditText) findViewById(R.id.etEmail);
        Email = etEmail.getText().toString();
        etPassword = (EditText) findViewById(R.id.etPassword);
        Password = etPassword.getText().toString();
        btnlogin = (Button) findViewById(R.id.btn_login);
        btnsignup = (Button) findViewById(R.id.btn_signup);
        forgotPass = (TextView) findViewById(R.id.tv_forgotpassword);
        goToSignup = (TextView) findViewById(R.id.tv_goto_signup);



        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        //Log.e("hello", "world1");
                        Intent intent = new Intent();
                intent.putExtra("Email", Email);
                intent.putExtra("Password", Password);
                        setResult(RESULT_OK, intent);
                        //Log.e("hello", "world2");
                        finish();


            }

        });

        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IndexActivity.this, ForgotPassword.class);
                startActivity(i);

            }
        });

        goToSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, Signup.class);
                startActivityForResult(intent, REQUEST_CODE_NEW);
            }
        });



    }



}
