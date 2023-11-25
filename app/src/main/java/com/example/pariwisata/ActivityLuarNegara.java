package com.example.pariwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLuarNegara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luar_negara);
        Button searchButtonn = findViewById(R.id.pindahGmaps);


        searchButtonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View    view) {
                String url = "https://www.google.com/maps/search/";
                String u = "Disney Tokyo";
                String keyword = url + u;
                Intent searchIntent = new Intent(Intent.ACTION_VIEW);

                searchIntent.setData(Uri.parse(keyword));
                startActivity(searchIntent);
            }
        });
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void pindahketu(View view) {
        Intent i = new Intent(ActivityLuarNegara.this, LuarNegaraTU.class);
        startActivity(i);
    }
}