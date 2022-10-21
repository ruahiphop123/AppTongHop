package com.example.apptonghop;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatCheckBox;

import java.util.List;

public class PhimAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Phim> listPhim;

    public PhimAdapter(Context context, int layout, List<Phim> listPhim) {
        this.context = context;
        this.layout = layout;
        this.listPhim = listPhim;
    }

    @Override
    public int getCount() {
        return listPhim.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        TextView hoTen, moTa;
        ImageView imgView;
        AppCompatCheckBox yeuThich;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.hoTen = (TextView) view.findViewById(R.id.tvTen);
            holder.moTa = (TextView) view.findViewById(R.id.tvMoTa);
            holder.imgView = (ImageView) view.findViewById(R.id.imgAvt);
            holder.yeuThich = (AppCompatCheckBox) view.findViewById(R.id.checkBoxYeuThich);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }

        Phim phim = listPhim.get(i);

        holder.hoTen.setText(phim.getHoTen());
        holder.moTa.setText(phim.getMoTa());
        holder.imgView.setImageResource(phim.getImg());
        holder.yeuThich.setChecked(phim.isYeuThich());

        return  view;
    }
}
