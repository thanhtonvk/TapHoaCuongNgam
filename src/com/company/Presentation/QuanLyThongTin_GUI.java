package com.company.Presentation;

import com.company.BusinessLogicLayer.QuanLyThongTin;
import com.company.BusinessLogicLayer.TimKiemThongTinSanPham;
import com.company.DataAccessLayer.SanPham_DAL;
import com.company.Entities.SanPham;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThongTin_GUI {

    private static void Menu(){
        System.out.println(".----------------------------------------------------.");
        System.out.println("|                QUẢN LÝ THÔNG TIN                   |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|               1.Nhập thông tin sản phẩm            |");
        System.out.println("|               2.Cập nhật thông tin sản phẩm        |");
        System.out.println("|               3.Xóa thông tin sản phẩm             |");
        System.out.println("|               4.Hiển thị thông tin sản phẩm        |");
        System.out.println("|               5.Tìm thông tin sản phẩm             |");
        System.out.println("|               0.Thoát                              |");
        System.out.println(".----------------------------------------------------.");
    }
    static Scanner scanner = new Scanner(System.in);
    public static void chon(ArrayList<SanPham>sanPhamArrayList) throws IOException {
        int chon;
        while(true){
            Menu();
            chon = Integer.parseInt(scanner.nextLine());
            if(chon ==0)break;
            switch (chon){
                case 1:
                    QuanLyThongTin.nhapThongTin(sanPhamArrayList);
                    SanPham_DAL.GhiFile(sanPhamArrayList);
                    break;
                case 2:
                    QuanLyThongTin.capNhat(sanPhamArrayList);
                    SanPham_DAL.GhiFile(sanPhamArrayList);
                    break;
                case 3:
                    QuanLyThongTin.xoa(sanPhamArrayList);
                    SanPham_DAL.GhiFile(sanPhamArrayList);
                    break;
                case 4:
                    QuanLyThongTin.hienSanPham(sanPhamArrayList);
                    break;
                case 5:
                    TimKiemThongTinSanPham.TimKiemSanPham(sanPhamArrayList);
                    break;
                default:break;
            }
        }
    }
}
