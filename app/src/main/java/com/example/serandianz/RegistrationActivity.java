package com.example.serandianz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_registration);
    }

    public void customerRegister(View view) {
        startActivity(new Intent(RegistrationActivity.this,CustomerRegistrationActivity.class));
    }
    public void PaymentActivity(View view){
        Intent intent=new Intent(this,PaymentActivity.class);
        startActivity(intent);
    }
}