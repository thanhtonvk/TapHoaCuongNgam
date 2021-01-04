package com.company.BusinessLogicLayer;

import com.company.Entities.HoaDonBanHang;
import com.company.Entities.MuaHang;
import com.company.Entities.SanPham;

import java.util.ArrayList;
import java.util.Scanner;

//String mahoadonban, String makhachhang, String ngayban, String tenmathang, double giaban, int soluong
public class QuanLyBanHang {
    static Scanner scanner = new Scanner(System.in);

    public static String getMatHang(ArrayList<SanPham> sanPhams) {
        String hang = scanner.nextLine();
        boolean kt = true;
        while (kt) {
            for (SanPham sanPham : sanPhams
            ) {
                if (hang.equalsIgnoreCase(sanPham.getTensanpham())) kt = false;
            }
            if (kt == true) {
                System.out.println("Không tồn tại sản phẩm, nhập lại");
                hang = scanner.nextLine();
            }
        }
        return hang;
    }

    public static void nhapThongTin(ArrayList<HoaDonBanHang> hoaDonBanHangArrayList, ArrayList<MuaHang> muaHangs, ArrayList<SanPham> sanPhams) {
        System.out.println("Nhập mã hóa đơn bán");
        String mahoadonban = scanner.nextLine();
        System.out.println("Nhập mã khách hàng");
        String makhachhang = scanner.nextLine();
        System.out.println("Nhập ngày bán");
        String ngayban = scanner.nextLine();
        while (true) {
            System.out.println("Nhập tên mặt hàng");
            String mathang = getMatHang(sanPhams);
            System.out.println("Nhập số lượng");
            int soluong = Integer.parseInt(scanner.nextLine());
            muaHangs.add(new MuaHang(mahoadonban,mathang, soluong));
            System.out.println("Bạn có muốn nhập thêm sản phẩm không?C/K");
            String chon = scanner.nextLine();
            if(chon.equalsIgnoreCase("k")) break;
        }
        hoaDonBanHangArrayList.add(new HoaDonBanHang(mahoadonban, makhachhang, ngayban));
    }

    public static HoaDonBanHang find(ArrayList<HoaDonBanHang> hoaDonBanHangArrayList, String keyword) {
        HoaDonBanHang result = null;
        for (HoaDonBanHang hoaDonBanHang : hoaDonBanHangArrayList
        ) {
            if (keyword.equalsIgnoreCase(hoaDonBanHang.getMahoadonban())) {
                result = hoaDonBanHang;
            }
        }
        return result;
    }

    public static void xoa(ArrayList<HoaDonBanHang> hoaDonBanHangArrayList) {
        System.out.println("Nhập tên mặt hàng, mã hóa đơn bán, hoặc ngày bán");
        String keyword = scanner.nextLine();
        HoaDonBanHang result = find(hoaDonBanHangArrayList, keyword);
        if (result == null) {
            System.out.println("Không tìm thấy hóa đơn bán");
        } else {
            hoaDonBanHangArrayList.remove(result);
            System.out.println("Xóa thành công");
        }
    }

    public static void display(HoaDonBanHang hoaDonBanHang) {
        System.out.printf("|%-20s|%-20s|%-20s|\n", hoaDonBanHang.getMahoadonban(), hoaDonBanHang.getMakhachhang(), hoaDonBanHang.getNgayban());
    }

    public static void inHoaDon(ArrayList<HoaDonBanHang> hoaDonBanHangArrayList,ArrayList<MuaHang>muaHangs,ArrayList<SanPham>sanPhams) {
        System.out.println("Nhập hóa đơn bán, hoặc ngày bán");
        String keyword = scanner.nextLine();
        int tong = 0;
        HoaDonBanHang result = find(hoaDonBanHangArrayList, keyword);
        if (result == null) {
            System.out.println("Không tìm thấy hóa đơn");
        } else {
            System.out.println("HÓA ĐƠN THANH TOÁN");
            display(result);
            System.out.println("Sản phẩm đã mua:");
            System.out.printf("|%-20s|%-20s|%-20s\n","Tên mặt hàng","Số lượng","Đơn giá");
            for (MuaHang muaHang:muaHangs
                 ) {
                if(result.getMahoadonban().equalsIgnoreCase(muaHang.getMahoadonban())){
                    tong+=muaHang.tinhTien(sanPhams);
                    System.out.printf("|%-20s|%-20s|%-20s|\n",muaHang.getTenmathang(),muaHang.getSoluong(),muaHang.tinhTien(sanPhams));
                }
            }
        }
        System.out.println("Số tiền phải trả là "+tong);
    }

    public static void hienHoaDonBanHang(ArrayList<HoaDonBanHang> hoaDonBanHangArrayList) {
        System.out.printf("|%-20s|%-20s|%-20s|\n", "Mã hóa đơn bán", "Mã khách hàng", "Ngày bán", "Tên mặt hàng");
        for (HoaDonBanHang hoaDonBanHang : hoaDonBanHangArrayList
        ) {
            display(hoaDonBanHang);
        }
    }
}
