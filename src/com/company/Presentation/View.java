package com.company.Presentation;

import com.company.DataAccessLayer.HoaDonBanHang_DAL;
import com.company.DataAccessLayer.HoaDonNhapHang_DAL;
import com.company.DataAccessLayer.NhanVien_DAL;
import com.company.DataAccessLayer.SanPham_DAL;
import com.company.Entities.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private static void Menu() {
        System.out.println(".----------------------------------------------------.");
        System.out.println("|              QUẢN LÝ TẠP HÓA HÙNG NGÂM             |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|               1.QUẢN LÝ BÁN HÀNG                   |");
        System.out.println("|               2.QUẢN LÝ NHẬP HÀNG                  |");
        System.out.println("|               3.QUẢN LÝ SẢN PHẨM                   |");
        System.out.println("|               4.QUẢN LÝ NHÂN VIÊN                  |");
        System.out.println("|               0.Thoát                              |");
        System.out.println(".----------------------------------------------------.");
    }


    public static void Run() throws IOException {
        ArrayList<HoaDonBanHang> hoaDonBanHangArrayList = new ArrayList<>();
        ArrayList<HoaDonNhapHang> hoaDonNhapHangArrayList = new ArrayList<>();
        ArrayList<NhanVien> nhanVienArrayList = new ArrayList<>();
        ArrayList<SanPham> sanPhamArrayList = new ArrayList<>();
        ArrayList<MuaHang> muaHangs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        HoaDonBanHang_DAL.DocFile(hoaDonBanHangArrayList);
        HoaDonNhapHang_DAL.DocFile(hoaDonNhapHangArrayList);
        NhanVien_DAL.DocFile(nhanVienArrayList);
        SanPham_DAL.DocFile(sanPhamArrayList);
        int chon;
        while (true) {
            Menu();
            chon = Integer.parseInt(scanner.nextLine());
            if (chon == 0) break;
            switch (chon) {
                case 1:
                    QuanLyBanHang_GUI.chon(hoaDonBanHangArrayList, muaHangs, sanPhamArrayList);
                    break;
                case 2:
                    QuanLyNhapHang_GUI.chon(hoaDonNhapHangArrayList);
                    break;
                case 3:
                    QuanLyThongTin_GUI.chon(sanPhamArrayList);
                    break;
                case 4:
                    QuanLyNhanVien_GUI.chon(nhanVienArrayList);
                    break;
                default:
                    break;
            }
        }
    }
}
