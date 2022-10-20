package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChiTietPhim extends AppCompatActivity {

    ImageFilterView imgPhim, imgBack;
    TextView ten,moTa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_phim);
        getSupportActionBar().hide();

        imgPhim = findViewById(R.id.imgPhimChiTiet);
        imgBack = findViewById(R.id.imgViewBackToList);
        ten = findViewById(R.id.chiTiet_Ten);
        moTa = findViewById(R.id.chiTiet_moTa);

        Intent intent = getIntent();
        imgPhim.setImageResource(intent.getIntExtra("hinhAnh",1));
        ten.setText(intent.getStringExtra("tenPhim"));
        moTa.setText(intent.getStringExtra("moTaPhim"));

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(ChiTietPhim.this, Anime.class);
//                startActivity(intent);
                finish();
            }
        });
    }
}