package com.company.Presentation;

import com.company.BusinessLogicLayer.QuanLyNhapHang;
import com.company.BusinessLogicLayer.QuanLyThongTin;
import com.company.BusinessLogicLayer.TimKiemHoaDon;
import com.company.DataAccessLayer.HoaDonNhapHang_DAL;
import com.company.Entities.HoaDonNhapHang;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhapHang_GUI {

    private static void Menu(){
        System.out.println(".----------------------------------------------------.");
        System.out.println("|                QUẢN LÝ HÓA ĐƠN NHẬP HÀNG            |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|               1.Nhập thông tin hóa đơn nhập         |");
        System.out.println("|               2.Cập nhật thông tin hóa đơn nhập     |");
        System.out.println("|               3.Xóa thông tin hóa đơn nhập          |");
        System.out.println("|               4.Hiển thị thông hóa đơn nhập         |");
        System.out.println("|               5.Tìm thông tin hóa đơn nhập          |");
        System.out.println("|               6.In hóa đơn nhập                     |");
        System.out.println("|               0.Thoát                              |");
        System.out.println(".----------------------------------------------------.");
    }
    static Scanner scanner = new Scanner(System.in);
    public static void chon(ArrayList<HoaDonNhapHang> hoaDonNhapHangArrayList) throws IOException {
        int chon;
        while(true){
            Menu();
            chon = Integer.parseInt(scanner.nextLine());
            if(chon ==0)break;
            switch (chon){
                case 1:
                    QuanLyNhapHang.nhapThongTin(hoaDonNhapHangArrayList);
                    HoaDonNhapHang_DAL.GhiFile(hoaDonNhapHangArrayList);
                    break;
                case 2:
                    QuanLyNhapHang.capNhat(hoaDonNhapHangArrayList);
                    HoaDonNhapHang_DAL.GhiFile(hoaDonNhapHangArrayList);
                    break;
                case 3:
                    QuanLyNhapHang.xoa(hoaDonNhapHangArrayList);
                    HoaDonNhapHang_DAL.GhiFile(hoaDonNhapHangArrayList);
                    break;
                case 4:
                    QuanLyNhapHang.hienHoaDonNhapHang(hoaDonNhapHangArrayList);
                    break;
                case 5:
                    TimKiemHoaDon.timHoaDonNhap(hoaDonNhapHangArrayList);
                    break;
                case 6:
                    QuanLyNhapHang.inHoaDon(hoaDonNhapHangArrayList);
                    break;
                default:break;
            }
        }
    }
}

