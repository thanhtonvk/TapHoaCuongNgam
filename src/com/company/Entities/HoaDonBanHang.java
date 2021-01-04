package com.company.Entities;

public class HoaDonBanHang {
    private String mahoadonban,makhachhang,ngayban;
    public HoaDonBanHang(String mahoadonban, String makhachhang, String ngayban) {
        this.mahoadonban = mahoadonban;
        this.makhachhang = makhachhang;
        this.ngayban = ngayban;

    }

    @Override
    public String toString(){
        return  mahoadonban+"#"+makhachhang+"#"+ngayban;
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


}
