package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Information extends AppCompatActivity {
    ImageView backHome;
    Button logOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        getSupportActionBar().hide();

        backHome = (ImageView) findViewById (R.id.BackToHome);
        logOut = (Button) findViewById(R.id.Logout);

        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Information.this, Home.class);
                startActivity(intent);
            }
        });

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Information.this, Login.class);
                Toast.makeText(Information.this, "Đăng Xuất!!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}