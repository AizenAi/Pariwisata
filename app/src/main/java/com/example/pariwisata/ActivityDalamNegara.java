package com.example.pariwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ActivityDalamNegara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalam_negara);
        Button searchButtonn = findViewById(R.id.pindahGmaps);

        searchButtonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/search/";
                String u = "Raja Ampat";
                String keyword = url + u;
                Intent searchIntent = new Intent(Intent.ACTION_VIEW);

                searchIntent.setData(Uri.parse(keyword));
                startActivity(searchIntent);
            }
        });
    }

    public void pindahketu(View view) {
        Intent i = new Intent(ActivityDalamNegara.this, dalamnegara2.class);
        startActivity(i);
    }
}
