package com.company.Entities;

public class SanPham {
    private String maloai,masanpham,tensanpham;
    private double giaban;
    private int soluong;
    private String donvitinh;

    public SanPham(String maloai, String masanpham, String tensanpham, double giaban, int soluong, String donvitinh) {
        this.maloai = maloai;
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.giaban = giaban;
        this.soluong = soluong;
        this.donvitinh = donvitinh;
    }
    @Override
    public String toString(){
        return maloai+"#"+masanpham+"#"+tensanpham+"#"+giaban+"#"+soluong+"#"+donvitinh;
    }
    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
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

    public String getDonvitinh() {
        return donvitinh;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }
}
