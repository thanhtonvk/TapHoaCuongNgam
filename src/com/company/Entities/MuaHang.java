package com.company.Entities;

import java.util.ArrayList;

public class MuaHang {
    private String mahoadonban,tenmathang;
    private int soluong;

    public String getMahoadonban() {
        return mahoadonban;
    }

    public void setMahoadonban(String mahoadonban) {
        this.mahoadonban = mahoadonban;
    }

    @Override
    public String toString(){
        return mahoadonban+"#"+tenmathang+"#"+soluong;
    }
    public double tinhTien(ArrayList<SanPham>sanPhamArrayList){
        double tong = 0;
        for (SanPham sanPham:sanPhamArrayList
             ) {
            if(tenmathang.equalsIgnoreCase(sanPham.getTensanpham())){
                tong=soluong*sanPham.getGiaban();
                break;
            }
        }
        return tong;
    }
    public String getTenmathang() {
        return tenmathang;
    }

    public void setTenmathang(String tenmathang) {
        this.tenmathang = tenmathang;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public MuaHang(String mahoadonban,String tenmathang, int soluong) {
        this.tenmathang = tenmathang;
        this.soluong = soluong;
        this.mahoadonban= mahoadonban;
    }
}
