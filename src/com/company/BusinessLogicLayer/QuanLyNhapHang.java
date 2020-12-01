package com.company.BusinessLogicLayer;

import com.company.Entities.HoaDonNhapHang;

import java.util.ArrayList;
import java.util.Scanner;
//String mahoadonnhap,String ngaynhap, String tenmathang, double giaban, int soluong
public class QuanLyNhapHang {
    static Scanner scanner = new Scanner(System.in);
    public static  void nhapThongTin(ArrayList<HoaDonNhapHang> hoaDonNhapHangArrayList){
        System.out.println("Nhập mã hóa đơn nhập");
        String mahoadonnhap = scanner.nextLine();
        System.out.println("Nhập ngày nhập");
        String ngaynhap = scanner.nextLine();
        System.out.println("Nhập tên mặt hàng");
        String mathang = scanner.nextLine();
        System.out.println("Nhập giá bán");
        double giaban =Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng");
        int soluong = Integer.parseInt(scanner.nextLine());

        hoaDonNhapHangArrayList.add(new HoaDonNhapHang(mahoadonnhap,ngaynhap,mathang,giaban,soluong));
    }
    public static HoaDonNhapHang find(ArrayList<HoaDonNhapHang>hoaDonNhapHangArrayList,String keyword){
        HoaDonNhapHang result = null;
        for (HoaDonNhapHang hoaDonNhapHang:hoaDonNhapHangArrayList
        ) {
            if(keyword.equalsIgnoreCase(hoaDonNhapHang.getMahoadonnhap())||keyword.equalsIgnoreCase(hoaDonNhapHang.getTenmathang())||keyword.equalsIgnoreCase(hoaDonNhapHang.getNgaynhap())){
                result  = hoaDonNhapHang;
            }
        }
        return  result;
    }
    public static void capNhat(ArrayList<HoaDonNhapHang>hoaDonNhapHangArrayList){
        System.out.println("Nhập tên mặt hàng, mã hóa đơn nhập, hoặc ngày nhập");
        String keyword = scanner.nextLine();
        HoaDonNhapHang result = find(hoaDonNhapHangArrayList,keyword);
        if(result==null){
            System.out.println("Không tìm thấy hóa đơn nhập");
        }
        else {
            System.out.println("Nhập mã hóa đơn nhập");
            result.setMahoadonnhap(scanner.nextLine());
            System.out.println("Nhập ngày nhập");
            result.setNgaynhap(scanner.nextLine());
            System.out.println("Nhập tên mã hàng");
            result.setTenmathang(scanner.nextLine());
            System.out.println("Nhập giá bán");
           result.setGiaban(Double.parseDouble(scanner.nextLine()));
            System.out.println("Số lượng");
            result.setSoluong(Integer.parseInt(scanner.nextLine()));
        }
    }
    public static void xoa(ArrayList<HoaDonNhapHang>hoaDonNhapHangArrayList){
        System.out.println("Nhập tên mặt hàng, mã hóa đơn nhập, hoặc ngày nhập");
        String keyword = scanner.nextLine();
        HoaDonNhapHang result = find(hoaDonNhapHangArrayList,keyword);
        if(result==null){
            System.out.println("Không tìm thấy hóa đơn nhập");
        }
        else {
            hoaDonNhapHangArrayList.remove(result);
            System.out.println("Xóa thành công");
        }
    }
    public static void display(HoaDonNhapHang hoaDonNhapHang){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n",hoaDonNhapHang.getMahoadonnhap(),hoaDonNhapHang.getNgaynhap(),hoaDonNhapHang.getTenmathang(),hoaDonNhapHang.getGiaban(),hoaDonNhapHang.getSoluong());
    }
    public static void inHoaDon(ArrayList<HoaDonNhapHang>hoaDonNhapHangArrayList){
        System.out.println("Nhập tên mặt hàng, mã hóa đơn nhập, hoặc ngày nhập");
        String keyword = scanner.nextLine();
        HoaDonNhapHang result = find(hoaDonNhapHangArrayList,keyword);
        if(result==null){
            System.out.println("Không tìm thấy sản phẩm");
        }
        else {
            System.out.println("                  HÓA ĐƠN NHẬP");
            System.out.println("__________________________________________________");
            System.out.printf("Mã hóa đơn nhập: %s\n",result.getMahoadonnhap());
            System.out.printf("Ngày nhập: %s\n",result.getNgaynhap());
            System.out.printf("Tên sản phẩm: %s\n",result.getTenmathang());
            System.out.printf("Giá bán: %s\n",result.getGiaban());
            System.out.printf("Số lượng: %s\n",result.getSoluong());

        }
    }
    public static void hienHoaDonNhapHang(ArrayList<HoaDonNhapHang>hoaDonNhapHangArrayList){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n","Mã hóa đơn nhập","Ngày nhập","Tên sản phẩm","Giá bán","Số lượng");
        for (HoaDonNhapHang hoaDonNhapHang:hoaDonNhapHangArrayList
        ) {
            display(hoaDonNhapHang);
        }
    }
}
