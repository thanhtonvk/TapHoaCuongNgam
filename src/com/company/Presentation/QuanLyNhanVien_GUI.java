package com.company.Presentation;

import com.company.BusinessLogicLayer.QuanLyNhanVien;
import com.company.BusinessLogicLayer.QuanLyThongTin;
import com.company.BusinessLogicLayer.TimKiemHoaDon;
import com.company.BusinessLogicLayer.TimKiemThongTinNhanVien;
import com.company.DataAccessLayer.NhanVien_DAL;
import com.company.Entities.NhanVien;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien_GUI {

    private static void Menu(){
        System.out.println(".----------------------------------------------------.");
        System.out.println("|                QUẢN LÝ NHÂN VIÊN                   |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|               1.Nhập thông tin nhân viên           |");
        System.out.println("|               2.Cập nhật thông tin nhân viên       |");
        System.out.println("|               3.Xóa thông tin nhân viên            |");
        System.out.println("|               4.Hiển thị thông nhân viên           |");
        System.out.println("|               5.Tìm thông tin nhân viên            |");
        System.out.println("|               0.Thoát                              |");
        System.out.println(".----------------------------------------------------.");
    }
    static Scanner scanner = new Scanner(System.in);
    public static void chon(ArrayList<NhanVien> nhanVienArrayList) throws IOException {
        int chon;
        while(true){
            Menu();
            chon = Integer.parseInt(scanner.nextLine());
            if(chon ==0)break;
            switch (chon){
                case 1:
                    QuanLyNhanVien.nhapThongTin(nhanVienArrayList);
                    NhanVien_DAL.GhiFile(nhanVienArrayList);
                    break;
                case 2:
                    QuanLyNhanVien.capNhat(nhanVienArrayList);
                    NhanVien_DAL.GhiFile(nhanVienArrayList);
                    break;
                case 3:
                    QuanLyNhanVien.xoa(nhanVienArrayList);
                    NhanVien_DAL.GhiFile(nhanVienArrayList);
                    break;
                case 4:
                    QuanLyNhanVien.hienNhanVien(nhanVienArrayList);
                    break;
                case 5:
                    TimKiemThongTinNhanVien.TimKiemNhanVien(nhanVienArrayList);
                    break;
                default:break;
            }
        }
    }
}
