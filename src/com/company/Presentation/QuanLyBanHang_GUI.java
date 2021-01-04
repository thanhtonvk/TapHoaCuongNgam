package com.company.Presentation;

import com.company.BusinessLogicLayer.QuanLyBanHang;
import com.company.BusinessLogicLayer.QuanLyThongTin;
import com.company.BusinessLogicLayer.TimKiemHoaDon;
import com.company.DataAccessLayer.HoaDonBanHang_DAL;
import com.company.Entities.HoaDonBanHang;
import com.company.Entities.MuaHang;
import com.company.Entities.SanPham;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyBanHang_GUI {

    private static void Menu(){
        System.out.println(".----------------------------------------------------.");
        System.out.println("|                QUẢN LÝ HÓA ĐƠN BÁN HÀNG            |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|               1.Nhập thông tin hóa đơn bán         |");
        System.out.println("|               2.In hóa đơn                         |");
        System.out.println("|               3.Xóa thông tin hóa đơn bán          |");
        System.out.println("|               4.Hiển thị thông hóa đơn bán         |");
        System.out.println("|               0.Thoát                              |");
        System.out.println(".----------------------------------------------------.");
    }
    static Scanner scanner = new Scanner(System.in);
    public static void chon(ArrayList<HoaDonBanHang> hoaDonBanHangArrayList, ArrayList<MuaHang>muaHangs, ArrayList<SanPham>sanPhams) throws IOException {
        int chon;
        while(true){
            Menu();
            chon = Integer.parseInt(scanner.nextLine());
            if(chon ==0)break;
            switch (chon){
                case 1:
                    QuanLyBanHang.nhapThongTin(hoaDonBanHangArrayList,muaHangs,sanPhams);
                    HoaDonBanHang_DAL.GhiFile(hoaDonBanHangArrayList);
                    break;
                case 2:
                    QuanLyBanHang.inHoaDon(hoaDonBanHangArrayList, muaHangs, sanPhams);
                    break;
                case 3:
                    QuanLyBanHang.xoa(hoaDonBanHangArrayList);
                    HoaDonBanHang_DAL.GhiFile(hoaDonBanHangArrayList);
                    break;
                case 4:
                    QuanLyBanHang.hienHoaDonBanHang(hoaDonBanHangArrayList);
                    break;
                default:break;
            }
        }
    }
}
