package com.company.Entities;

public class NhanVien {
    private int manhanvien;
    private String tennhanvien,diachi,sodienthoai,email;

    @Override
    public String toString(){
        return manhanvien+"#"+tennhanvien+"#"+diachi+"#"+sodienthoai+"#"+email;
    }
    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getTennhanvien() {
        return tennhanvien;
    }

    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NhanVien(int manhanvien, String tennhanvien, String diachi, String sodienthoai, String email) {
        this.manhanvien = manhanvien;
        this.tennhanvien = tennhanvien;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
        this.email = email;
    }
}
