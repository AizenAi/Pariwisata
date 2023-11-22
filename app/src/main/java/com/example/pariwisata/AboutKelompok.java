package com.example.pariwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AboutKelompok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_kelompok);

    }

    public void minggat1(View view) {
        Uri uri = Uri.parse("https://wa.me/6281325154774");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void minggat2(View view) {
        Uri uri = Uri.parse("https://wa.me/6281521563942");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void minggat3(View view) {
        Uri uri = Uri.parse("https://wa.me/6285799788878");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void minggat4(View view) {
        Uri uri = Uri.parse("https://wa.me/6281328662370");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void igesatu(View view) {
        Uri uri = Uri.parse("https://www.instagram.com/rafiaslinofake/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void igedua(View view) {
        Uri uri = Uri.parse("https://www.instagram.com/yyowdnuvhereee/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void igetiga(View view) {
        Uri uri = Uri.parse("https://www.instagram.com/rasyad.mencarinama/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void igeempat(View view) {
        Uri uri = Uri.parse("https://www.instagram.com/drianvon_/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}