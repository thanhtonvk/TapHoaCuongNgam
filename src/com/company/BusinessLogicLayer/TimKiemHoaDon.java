package com.company.BusinessLogicLayer;

import com.company.Entities.HoaDonBanHang;
import com.company.Entities.HoaDonNhapHang;

import java.util.ArrayList;
import java.util.Scanner;

public class TimKiemHoaDon {
    static Scanner scanner = new Scanner(System.in);
    public static  void timHoaDonNhap(ArrayList<HoaDonNhapHang>hoaDonNhapHangArrayList){
        QuanLyNhapHang.inHoaDon(hoaDonNhapHangArrayList);
    }
    public static void timHoaDonBan(ArrayList<HoaDonBanHang>hoaDonBanHangArrayList){
        QuanLyBanHang.inHoaDon(hoaDonBanHangArrayList);
    }
}
