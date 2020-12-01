package com.company.BusinessLogicLayer;

import com.company.Entities.NhanVien;

import java.util.ArrayList;
import java.util.Scanner;
//int manhanvien, String tennhanvien, String diachi, String sodienthoai, String email
public class QuanLyNhanVien {
    static Scanner scanner = new Scanner(System.in);
    public static  void nhapThongTin(ArrayList<NhanVien> nhanVienArrayList){
        System.out.println("Nhập mã nhân viên");
        int manhanvien = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhân viên");
        String tennhanvien = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String diachi = scanner.nextLine();
        System.out.println("Nhập số điện thoại");
        String sdt = scanner.nextLine();
        System.out.println("Nhập email");
        String email =scanner.nextLine();


        nhanVienArrayList.add(new NhanVien(manhanvien,tennhanvien,diachi,sdt,email));
    }
    public static NhanVien find(ArrayList<NhanVien>nhanVienArrayList,String keyword){
        NhanVien result = null;
        for (NhanVien nhanVien:nhanVienArrayList
        ) {
            if(keyword.equalsIgnoreCase(String.valueOf(nhanVien.getManhanvien()))||keyword.equalsIgnoreCase(nhanVien.getTennhanvien())||keyword.equalsIgnoreCase(nhanVien.getEmail())){
                result  = nhanVien;
            }
        }
        return  result;
    }
    public static void capNhat(ArrayList<NhanVien>nhanVienArrayList){
        System.out.println("Nhập tên nhân viên, mã nhân viên,");
        String keyword = scanner.nextLine();
        NhanVien result = find(nhanVienArrayList,keyword);
        if(result==null){
            System.out.println("Không tìm thấy nhân viên");
        }
        else {
            System.out.println("Nhập mã nhân viên");
           result.setManhanvien(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập tên nhân viên");
            result.setTennhanvien(scanner.nextLine());
            System.out.println("Nhập địa chỉ");
            result.setDiachi(scanner.nextLine());
            System.out.println("Nhập số điện thoại");
            result.setSodienthoai(scanner.nextLine());
            System.out.println("Nhập email");
            result.setEmail(scanner.nextLine());
        }
    }
    public static void xoa(ArrayList<NhanVien>nhanVienArrayList){
        System.out.println("Nhập tên nhân viên, mã nhân viên,");
        String keyword = scanner.nextLine();
        NhanVien result = find(nhanVienArrayList,keyword);
        if(result==null){
            System.out.println("Không tìm thấy nhân viên");
        }
        else {
            nhanVienArrayList.remove(result);
            System.out.println("Xóa thành công");
        }
    }
    public static void display(NhanVien nhanVien){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n",nhanVien.getTennhanvien(),nhanVien.getManhanvien(),nhanVien.getDiachi(),nhanVien.getSodienthoai(),nhanVien.getEmail());
    }
    public static void hienNhanVien(ArrayList<NhanVien>nhanVienArrayList){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|n","Mã nhân viên","Tên nhân viên","Địa chỉ","Số điện thoại","Email");
        for (NhanVien nhanVien:nhanVienArrayList
        ) {
            display(nhanVien);
        }
    }
}
