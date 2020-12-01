package com.company.Entities;

public class HoaDonBanHang {
    private String mahoadonban,makhachhang,ngayban,tenmathang;
    private double giaban;
    private int soluong;

    public HoaDonBanHang(String mahoadonban, String makhachhang, String ngayban, String tenmathang, double giaban, int soluong) {
        this.mahoadonban = mahoadonban;
        this.makhachhang = makhachhang;
        this.ngayban = ngayban;
        this.tenmathang = tenmathang;
        this.giaban = giaban;
        this.soluong = soluong;
    }

    @Override
    public String toString(){
        return  mahoadonban+"#"+makhachhang+"#"+ngayban+"#"+tenmathang+"#"+giaban+"#"+soluong;
    }
    public String getMahoadonban() {
        return mahoadonban;
    }

    public void setMahoadonban(String mahoadonban) {
        this.mahoadonban = mahoadonban;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getNgayban() {
        return ngayban;
    }

    public void setNgayban(String ngayban) {
        this.ngayban = ngayban;
    }

    public String getTenmathang() {
        return tenmathang;
    }

    public void setTenmathang(String tenmathang) {
        this.tenmathang = tenmathang;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
