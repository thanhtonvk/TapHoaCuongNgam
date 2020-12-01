package com.company.Entities;

public class HoaDonNhapHang {
    private String ngaynhap,tenmathang;
    private double giaban;
    private int soluong;
    private String mahoadonnhap;

    public String getMahoadonnhap() {
        return mahoadonnhap;
    }

    public void setMahoadonnhap(String mahoadonnhap) {
        this.mahoadonnhap = mahoadonnhap;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
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

    public HoaDonNhapHang(String mahoadonnhap,String ngaynhap, String tenmathang, double giaban, int soluong) {
        this.ngaynhap = ngaynhap;
        this.tenmathang = tenmathang;
        this.giaban = giaban;
        this.soluong = soluong;
        this.mahoadonnhap = mahoadonnhap;
    }

    @Override
    public String toString(){
        return mahoadonnhap+"#"+ ngaynhap+"#"+tenmathang+"#"+giaban+"#"+soluong;
    }
}
