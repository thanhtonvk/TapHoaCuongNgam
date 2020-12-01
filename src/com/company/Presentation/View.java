package com.company.Presentation;

import com.company.DataAccessLayer.HoaDonBanHang_DAL;
import com.company.DataAccessLayer.HoaDonNhapHang_DAL;
import com.company.DataAccessLayer.NhanVien_DAL;
import com.company.DataAccessLayer.SanPham_DAL;
import com.company.Entities.HoaDonBanHang;
import com.company.Entities.HoaDonNhapHang;
import com.company.Entities.NhanVien;
import com.company.Entities.SanPham;

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

    static ArrayList<HoaDonBanHang> hoaDonBanHangArrayList = new ArrayList<>();
    static ArrayList<HoaDonNhapHang> hoaDonNhapHangArrayList = new ArrayList<>();
    static ArrayList<NhanVien> nhanVienArrayList = new ArrayList<>();
    static ArrayList<SanPham> sanPhamArrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void Run() throws IOException {
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
                    QuanLyBanHang_GUI.chon(hoaDonBanHangArrayList);
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
                default:break;
            }
        }
    }
}
