package com.example.apptonghop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NguoiAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Nguoi> listNguoi;

    public NguoiAdapter(Context context, int layout, List<Nguoi> listNguoi) {
        this.context = context;
        this.layout = layout;
        this.listNguoi = listNguoi;
    }

    @Override
    public int getCount() {
        return listNguoi.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout,null);

        TextView hoTen = (TextView) view.findViewById(R.id.tvTen);
        TextView tuoi = (TextView) view.findViewById(R.id.tvTuoi);
        TextView gioiTinh = (TextView) view.findViewById(R.id.tvGioiTinh);
        TextView moTa = (TextView) view.findViewById(R.id.tvMoTa);
        ImageView imgView = (ImageView) view.findViewById(R.id.imgAvt);

        Nguoi nguoi = listNguoi.get(i);

        hoTen.setText(nguoi.getHoTen());
        tuoi.setText(String.valueOf(nguoi.getTuoi()));
        gioiTinh.setText(nguoi.getGioiTinh());
        moTa.setText(nguoi.getMoTa());
        imgView.setImageResource(nguoi.getImg());

        return  view;
    }
}
