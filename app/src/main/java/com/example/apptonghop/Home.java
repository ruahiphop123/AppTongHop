package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {
    LinearLayout Profile, ListAnime, ListHot;
    ImageFilterView imgToProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        Profile = (LinearLayout) findViewById(R.id.Profile_Home);
        ListAnime = (LinearLayout) findViewById(R.id.listItem_Home);
        imgToProfile = findViewById(R.id.imgViewToProfile);
        ListHot = findViewById(R.id.phimHot_Home);

        ListHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,PhimHot.class);
                startActivity(intent);
            }
        });


        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,Information.class);
                startActivity(intent);
            }
        });

        imgToProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,Information.class);
                startActivity(intent);
            }
        });
        ListAnime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Anime.class);
                startActivity(intent);
            }
        });


    }
}