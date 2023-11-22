package com.example.pariwisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 1000;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.navView);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = 500;
        layoutParams.height = 500;
        imageView.setLayoutParams(layoutParams);
        Button button = findViewById(R.id.navView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iGallery = new Intent(Intent.ACTION_PICK);
                iGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivity(iGallery);
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.navView);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    gantiFragment(new HomeFragment());
                    return true;

                case R.id.favorite:
                    gantiFragment(new FavoriteFragment());
                    return true;

                case R.id.profile:
                    gantiFragment(new ProfileFragment());
                    return true;

                case R.id.aboutboss:
                    gantiFragment(new AboutFragment());
                    return true;
            }
            return false;
        });
    }
    private void gantiFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
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