package com.company.Presentation;

import com.company.BusinessLogicLayer.QuanLyBanHang;
import com.company.BusinessLogicLayer.QuanLyThongTin;
import com.company.BusinessLogicLayer.TimKiemHoaDon;
import com.company.DataAccessLayer.HoaDonBanHang_DAL;
import com.company.Entities.HoaDonBanHang;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyBanHang_GUI {

    private static void Menu(){
        System.out.println(".----------------------------------------------------.");
        System.out.println("|                QUẢN LÝ HÓA ĐƠN BÁN HÀNG            |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|               1.Nhập thông tin hóa đơn bán         |");
        System.out.println("|               2.Cập nhật thông tin hóa đơn bán     |");
        System.out.println("|               3.Xóa thông tin hóa đơn bán          |");
        System.out.println("|               4.Hiển thị thông hóa đơn bán         |");
        System.out.println("|               5.Tìm thông tin hóa đơn bán          |");
        System.out.println("|               6.In hóa đơn bán                     |");
        System.out.println("|               0.Thoát                              |");
        System.out.println(".----------------------------------------------------.");
    }
    static Scanner scanner = new Scanner(System.in);
    public static void chon(ArrayList<HoaDonBanHang> hoaDonBanHangArrayList) throws IOException {
        int chon;
        while(true){
            Menu();
            chon = Integer.parseInt(scanner.nextLine());
            if(chon ==0)break;
            switch (chon){
                case 1:
                    QuanLyBanHang.nhapThongTin(hoaDonBanHangArrayList);
                    HoaDonBanHang_DAL.GhiFile(hoaDonBanHangArrayList);
                    break;
                case 2:
                    QuanLyBanHang.capNhat(hoaDonBanHangArrayList);
                    HoaDonBanHang_DAL.GhiFile(hoaDonBanHangArrayList);
                    break;
                case 3:
                    QuanLyBanHang.xoa(hoaDonBanHangArrayList);
                    HoaDonBanHang_DAL.GhiFile(hoaDonBanHangArrayList);
                    break;
                case 4:
                    QuanLyBanHang.hienHoaDonBanHang(hoaDonBanHangArrayList);
                    break;
                case 5:
                    TimKiemHoaDon.timHoaDonBan(hoaDonBanHangArrayList);
                    break;
                case 6:
                    QuanLyBanHang.inHoaDon(hoaDonBanHangArrayList);
                    break;
                default:break;
            }
        }
    }
}
