package com.example.pariwisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
}