package com.fbauthmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    
    @Override
    public void onBackPressed(){
    finish();
    finishAffinity();
        super.onBackPressed();
    }
}
