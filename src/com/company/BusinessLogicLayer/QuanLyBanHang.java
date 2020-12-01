package com.company.BusinessLogicLayer;

import com.company.Entities.HoaDonBanHang;

import java.util.ArrayList;
import java.util.Scanner;
//String mahoadonban, String makhachhang, String ngayban, String tenmathang, double giaban, int soluong
public class QuanLyBanHang {
    static Scanner scanner = new Scanner(System.in);
    public static  void nhapThongTin(ArrayList<HoaDonBanHang> hoaDonBanHangArrayList){
        System.out.println("Nhập mã hóa đơn bán");
        String mahoadonban = scanner.nextLine();
        System.out.println("Nhập mã khách hàng");
        String makhachhang = scanner.nextLine();
        System.out.println("Nhập ngày bán");
        String ngayban = scanner.nextLine();
        System.out.println("Nhập tên mặt hàng");
        String tenmathang = scanner.nextLine();
        System.out.println("Nhập giá bán");
        double giaban =Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng");
        int soluong = Integer.parseInt(scanner.nextLine());

        hoaDonBanHangArrayList.add(new HoaDonBanHang(mahoadonban,makhachhang,ngayban,tenmathang,giaban,soluong));
    }
    public static HoaDonBanHang find(ArrayList<HoaDonBanHang>hoaDonBanHangArrayList,String keyword){
        HoaDonBanHang result = null;
        for (HoaDonBanHang hoaDonBanHang:hoaDonBanHangArrayList
        ) {
            if(keyword.equalsIgnoreCase(hoaDonBanHang.getMahoadonban())||keyword.equalsIgnoreCase(hoaDonBanHang.getTenmathang())||keyword.equalsIgnoreCase(hoaDonBanHang.getNgayban())){
                result  = hoaDonBanHang;
            }
        }
        return  result;
    }
    public static void capNhat(ArrayList<HoaDonBanHang>hoaDonBanHangArrayList){
        System.out.println("Nhập tên mặt hàng, mã hóa đơn bán, hoặc ngày bán");
        String keyword = scanner.nextLine();
        HoaDonBanHang result = find(hoaDonBanHangArrayList,keyword);
        if(result==null){
            System.out.println("Không tìm thấy hóa đơn bán");
        }
        else {
            System.out.println("Nhập mã hóa đơn bán");
            result.setMahoadonban( scanner.nextLine());
            System.out.println("Nhập mã khách hàng");
            result.setMakhachhang( scanner.nextLine());
            System.out.println("Nhập ngày bán dd/mm/yyyy");
            result.setNgayban( scanner.nextLine());
            System.out.println("Nhập tên mặt hàng");
            result.setTenmathang( scanner.nextLine());
            System.out.println("Nhập giá bán");
            result.setGiaban(Double.parseDouble(scanner.nextLine()));
            System.out.println("Số lượng");
            result.setSoluong(Integer.parseInt(scanner.nextLine()));
        }
    }
    public static void xoa(ArrayList<HoaDonBanHang>hoaDonBanHangArrayList){
        System.out.println("Nhập tên mặt hàng, mã hóa đơn bán, hoặc ngày bán");
        String keyword = scanner.nextLine();
        HoaDonBanHang result = find(hoaDonBanHangArrayList,keyword);
        if(result==null){
            System.out.println("Không tìm thấy hóa đơn bán");
        }
        else {
            hoaDonBanHangArrayList.remove(result);
            System.out.println("Xóa thành công");
        }
    }
    public static void display(HoaDonBanHang hoaDonBanHang){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n",hoaDonBanHang.getMahoadonban(),hoaDonBanHang.getMakhachhang(),hoaDonBanHang.getNgayban(),hoaDonBanHang.getTenmathang(),hoaDonBanHang.getGiaban(),hoaDonBanHang.getSoluong());
    }
    public static void inHoaDon(ArrayList<HoaDonBanHang>hoaDonBanHangArrayList){
        System.out.println("Nhập tên mặt hàng, mã hóa đơn bán, hoặc ngày bán");
        String keyword = scanner.nextLine();
        HoaDonBanHang result = find(hoaDonBanHangArrayList,keyword);
        if(result==null){
            System.out.println("Không tìm thấy sản phẩm");
        }
        else {
            System.out.println("                  HÓA ĐƠN BÁN");
            System.out.println("__________________________________________________");
            System.out.printf("Mã hóa đơn bán: %s\n",result.getMahoadonban());
            System.out.printf("Ngày bán: %s\n",result.getNgayban());
            System.out.printf("Tên sản phẩm: %s\n",result.getTenmathang());
            System.out.printf("Giá bán: %s\n",result.getGiaban());
            System.out.printf("Số lượng: %s\n",result.getSoluong());

        }
    }
    public static void hienHoaDonBanHang(ArrayList<HoaDonBanHang>hoaDonBanHangArrayList){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n","Mã hóa đơn bán","Mã khách hàng","Ngày bán","Tên mặt hàng","Giá bán","Số lượng");
        for (HoaDonBanHang hoaDonBanHang:hoaDonBanHangArrayList
        ) {
            display(hoaDonBanHang);
        }
    }
}
