package com.example.pariwisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class formlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formlogin);

    }

    public void masuklogin(View view) {
        Intent intent = new Intent(formlogin.this, MainActivity.class);
        startActivity(intent);

        Toast toast = Toast.makeText(this, "Anda Berhasil Masuk ", Toast.LENGTH_LONG);
        toast.show();
    }
}
