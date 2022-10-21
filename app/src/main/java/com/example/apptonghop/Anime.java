package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import java.util.ArrayList;

public class Anime extends AppCompatActivity {

    android.widget.ListView lvNguoi;
    ArrayList<Phim> arrayPhim;
    PhimAdapter adapter;
    ImageView backHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_list);
        getSupportActionBar().hide();

        AnhXa();

        backHome = (ImageView) findViewById(R.id.imgAnimeBackToHome);
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        adapter = new PhimAdapter(this, R.layout.line_phim, arrayPhim);
        lvNguoi.setAdapter(adapter);
        lvNguoi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Anime.this, ChiTietPhim.class);
                intent.putExtra("tenPhim", arrayPhim.get(i).getHoTen());
                intent.putExtra("moTaPhim", arrayPhim.get(i).getMoTa());
                intent.putExtra("hinhAnh", arrayPhim.get(i).getImg());
                startActivity(intent);
            }
        });
    }

    private void AnhXa() {
        lvNguoi = (android.widget.ListView) findViewById(R.id.listViewNguoi);
        arrayPhim = new ArrayList<>();
        //ten, tyoi, gioi tinh, img, mota
        arrayPhim.add(new Phim("Naruto Shippuden", "Bộ phim hoạt hình nổi tiếng Naruto, lấy bối cảnh hai năm rưỡi sau khi Naruto rời làng Lá.", R.drawable.anh1,false));
        arrayPhim.add(new Phim("Naruto Movie", "Ngoại truyện của bộ phim Naruto, khi Naruto và nhóm bạn đi đến làng Tuyết.", R.drawable.anh2,true));
        arrayPhim.add(new Phim("Boruto: Naruto Next Generation","Thế hệ sau của Naruto, bộ phim vẫn lấy bối cảnh là thế giới Ninja nhưng nhân vật chính lần này lại là Uzumaki Boruto,", R.drawable.anh3,true));
        arrayPhim.add(new Phim("Assassination Classroom", "Lãnh đạo các nước đều giao trách nhiệm ám sát Koro-Sensei cho Lớp 3-E và giao vũ khí đặc biệt cho họ", R.drawable.anh4,false));
        arrayPhim.add(new Phim("OnePiece", "Phim Đảo Hải Tặc mở đầu câu chuyện bằng cảnh xử tử vua hải tặc Gol D. Roger. Trước khi chết ông đã tiết lộ rằng mình có một kho báu...", R.drawable.anh5,true));
        arrayPhim.add(new Phim("Thất hình đại tội","Một nhóm chiến binh có tham vọng lật đổ vương quốc Britannia, được cho là đã bị tiêu diệt bởi các hiệp sĩ thánh chiến", R.drawable.anh6,false));
        arrayPhim.add(new Phim("Doraemon: Vương quốc trên mây","Nobita muốn được đến thiên đường trên chín tầng mây, nơi mà cậu thường nghe nói đến trong truyện cổ tích", R.drawable.anh7,false));

    }
    //ten, tyoi, gioi tinh, img, mota
//        arrayPhimHot.add(new Phim("Descendants of The Sun", "Nội dung phim xoay quanh hai nhân vật Yoo Shi Jin và Kang Mo Yeon. Yoo Shi Jin là đội trưởng lực lượng gìn giữ hòa bình của Liên Hợp Quốc.", R.drawable.anh1_phimhot));
//        arrayPhimHot.add(new Phim("Two World", "Câu chuyện tình yêu giữa một cặp đôi đang ở trong độ đầu 30 tuổi, cùng thời đại nhưng ở hai thế giới", R.drawable.anh2_phimhot));
//        arrayPhimHot.add(new Phim("My Love From The Star"," Một người ngoài hành tinh tới Trái Đất trong triều đại Joseon và đem lòng yêu một nữ diễn viên", R.drawable.anh3_phimhot));
//        arrayPhimHot.add(new Phim("Cô dâu 8 tuổi", "Phim đề cập đến các khía cạnh khác nhau của vấn nạn tảo hôn ở Ấn Độ.", R.drawable.anh4_phimhot));
//        arrayPhimHot.add(new Phim("Gạo nếp gạo tẻ", "Phim tình cảm xoay quanh gia đình Bà Mai và Ông Vương, đem lại nhiều tiếng cười lẫn nước mắt cho người xem.", R.drawable.anh5_phimhot));
//        arrayPhimHot.add(new Phim("2 ngày 1 đêm","Chương trình thực tế đang hot nhất hiện nay, với 6 thành viên chính mang đến rất nhiều tiếng cười cho quý vị.", R.drawable.anh6_phimhot));
//        arrayPhimHot.add(new Phim("Phim Cổ Tích","Tuyển tập những truyện cổ tích Việt chuyển thể hay nhất mọi thời đại ", R.drawable.anh7_phimhot));
}