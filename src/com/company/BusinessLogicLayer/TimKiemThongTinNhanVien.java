package com.company.BusinessLogicLayer;

import com.company.Entities.NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class TimKiemThongTinNhanVien {
    static Scanner scanner= new Scanner(System.in);
    public static  void TimKiemNhanVien(ArrayList<NhanVien>nhanVienArrayList){
        System.out.println("Nhập tên nhân viên, mã nhân viên,");
        String keyword = scanner.nextLine();
        NhanVien result = QuanLyNhanVien.find(nhanVienArrayList,keyword);
        if(result==null){
            System.out.println("Không tìm thấy nhân viên");
        }
        else {
            System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|n","Mã nhân viên","Tên nhân viên","Địa chỉ","Số điện thoại","Email");
            QuanLyNhanVien.display(result);
        }
    }
}
