package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class DanhSach extends AppCompatActivity {

    android.widget.ListView lvNguoi;
    ArrayList<Nguoi> arrayNguoi;
    NguoiAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        getSupportActionBar().hide();

        AnhXa();

        adapter = new NguoiAdapter(this, R.layout.line_person, arrayNguoi);
        lvNguoi.setAdapter(adapter);
    }

    private void AnhXa() {
        lvNguoi = (android.widget.ListView) findViewById(R.id.listViewNguoi);
        arrayNguoi = new ArrayList<>();
        //ten, tyoi, gioi tinh, img, mota
        arrayNguoi.add(new Nguoi("Trí Đức", 20, "Nam", "Xin chào", R.drawable.anh1));
        arrayNguoi.add(new Nguoi("Văn A", 20, "Nam", "Xin chào", R.drawable.anh2));
        arrayNguoi.add(new Nguoi("Sang B", 20, "Nữ", "Xin chào", R.drawable.anh3));
        arrayNguoi.add(new Nguoi("Chí C", 20, "Nam", "Xin chào", R.drawable.anh4));
        arrayNguoi.add(new Nguoi("Tình Hữu", 20, "Nữ", "Xin chào", R.drawable.anh5));
    }
}