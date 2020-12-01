package com.company.BusinessLogicLayer;

import com.company.Entities.SanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThongTin {
    static Scanner scanner = new Scanner(System.in);
    public static  void nhapThongTin(ArrayList<SanPham>sanPhamArrayList){
        System.out.println("Nhập mã loại");
        String maloai = scanner.nextLine();
        System.out.println("Nhập mã sản phẩm");
        String masanpham = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String tensanpham = scanner.nextLine();
        System.out.println("Nhập giá bán");
        double giaban =Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng");
        int soluong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập đơn vị tính");
        String donvitinh = scanner.nextLine();
        sanPhamArrayList.add(new SanPham(maloai,masanpham,tensanpham,giaban,soluong,donvitinh));
    }
    public static SanPham find(ArrayList<SanPham>sanPhamArrayList,String keyword){
        SanPham result = null;
        for (SanPham sanPham:sanPhamArrayList
             ) {
            if(keyword.equalsIgnoreCase(sanPham.getTensanpham())||keyword.equalsIgnoreCase(sanPham.getMasanpham())||keyword.equalsIgnoreCase(sanPham.getMaloai())){
                result  = sanPham;
            }
        }
        return  result;
    }
    public static void capNhat(ArrayList<SanPham>sanPhamArrayList){
        System.out.println("Nhập tên, mã sản phẩm hoặc mã loại");
        String keyword = scanner.nextLine();
        SanPham result = find(sanPhamArrayList,keyword);
        if(result==null){
            System.out.println("Không tìm thấy sản phẩm");
        }
        else {
            System.out.println("Nhập mã loại");
            result.setMaloai(scanner.nextLine());
            System.out.println("Nhập mã sản phẩm");
            result.setMasanpham(scanner.nextLine());
            System.out.println("Nhập tên sản phẩm");
            result.setTensanpham(scanner.nextLine());
            System.out.println("Nhập giá bán");
            result.setGiaban(Double.parseDouble(scanner.nextLine()));
            System.out.println("Số lượng");
            result.setSoluong(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập đơn vị tính");
            result.setDonvitinh(scanner.nextLine());
            System.out.println("Cập nhật thành công");
        }
    }
    public static void xoa(ArrayList<SanPham>sanPhamArrayList){
        System.out.println("Nhập tên, mã sản phẩm hoặc mã loại");
        String keyword = scanner.nextLine();
        SanPham result = find(sanPhamArrayList,keyword);
        if(result==null){
            System.out.println("Không tìm thấy sản phẩm");
        }
        else {
            sanPhamArrayList.remove(result);
            System.out.println("Xóa thành công");
        }
    }
    public static void display(SanPham sanPham){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n",sanPham.getMaloai(),sanPham.getMasanpham(),sanPham.getTensanpham(),sanPham.getGiaban(),sanPham.getSoluong(),sanPham.getDonvitinh());
    }
    public static void hienSanPham(ArrayList<SanPham>sanPhamArrayList){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n","Mã loại","Mã sản phầm","Tên sản phẩm","Giá bán","Số lượng","Đơn vị tính");
        for (SanPham sanPham:sanPhamArrayList
             ) {
            display(sanPham);
        }
    }
}
