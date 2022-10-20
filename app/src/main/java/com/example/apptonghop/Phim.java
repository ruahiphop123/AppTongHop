package com.example.apptonghop;

import java.io.Serializable;

public class Phim implements Serializable {
    private String hoTen;
    private String moTa;
    private int img;

    public Phim(String hoTen, String moTa, int img) {
        this.hoTen = hoTen;
        this.moTa = moTa;
        this.img = img;
    }

    public Phim() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
