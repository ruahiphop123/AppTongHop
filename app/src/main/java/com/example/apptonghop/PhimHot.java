package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import java.util.ArrayList;

public class PhimHot extends AppCompatActivity {

    android.widget.ListView lvPhimHot;
    ArrayList<Phim> arrayPhimHot;
    PhimAdapter adapter;
    ImageView backHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phim_hot);
        getSupportActionBar().hide();

        AnhXa();

        backHome = findViewById(R.id.imgPhimHotToHome);
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhimHot.this, Home.class);
                startActivity(intent);
            }
        });

        adapter = new PhimAdapter(this, R.layout.line_phim, arrayPhimHot);
        lvPhimHot.setAdapter(adapter);
        lvPhimHot.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(PhimHot.this, ChiTietPhim.class);
                intent.putExtra("tenPhim", arrayPhimHot.get(i).getHoTen());
                intent.putExtra("moTaPhim", arrayPhimHot.get(i).getMoTa());
                intent.putExtra("hinhAnh", arrayPhimHot.get(i).getImg());
                startActivity(intent);
            }
        });
    }

    private void AnhXa() {
        lvPhimHot = (android.widget.ListView) findViewById(R.id.listViewPhimHot);
        arrayPhimHot = new ArrayList<>();
        arrayPhimHot.add(new Phim("Descendants of The Sun", "Nội dung phim xoay quanh hai nhân vật Yoo Shi Jin và Kang Mo Yeon. Yoo Shi Jin là đội trưởng lực lượng gìn giữ hòa bình của Liên Hợp Quốc.", R.drawable.anh1_phimhot,true));
        arrayPhimHot.add(new Phim("Two World", "Câu chuyện tình yêu giữa một cặp đôi đang ở trong độ đầu 30 tuổi, cùng thời đại nhưng ở hai thế giới", R.drawable.anh2_phimhot,false));
        arrayPhimHot.add(new Phim("My Love From The Star"," Một người ngoài hành tinh tới Trái Đất trong triều đại Joseon và đem lòng yêu một nữ diễn viên", R.drawable.anh3_phimhot,false));
        arrayPhimHot.add(new Phim("Cô dâu 8 tuổi", "Phim đề cập đến các khía cạnh khác nhau của vấn nạn tảo hôn ở Ấn Độ.", R.drawable.anh4_phimhot,true));
        arrayPhimHot.add(new Phim("Gạo nếp gạo tẻ", "Phim tình cảm xoay quanh gia đình Bà Mai và Ông Vương, đem lại nhiều tiếng cười lẫn nước mắt cho người xem.", R.drawable.anh5_phimhot,false));
        arrayPhimHot.add(new Phim("2 ngày 1 đêm","Chương trình thực tế đang hot nhất hiện nay, với 6 thành viên chính mang đến rất nhiều tiếng cười cho quý vị.", R.drawable.anh6_phimhot,false));
        arrayPhimHot.add(new Phim("Phim Cổ Tích","Tuyển tập những truyện cổ tích Việt chuyển thể hay nhất mọi thời đại ", R.drawable.anh7_phimhot,true));
    }
}