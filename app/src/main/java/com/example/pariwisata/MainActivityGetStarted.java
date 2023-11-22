package com.example.pariwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivityGetStarted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_get_started);
    }



    public void asjda(View view) {
        Intent intent = new Intent(MainActivityGetStarted.this, formlogin.class );
        startActivity(intent);
    }

    public void button(View view) {
        Intent intent = new Intent(MainActivityGetStarted.this, MainActivity.class);
        startActivity(intent);
    }
}