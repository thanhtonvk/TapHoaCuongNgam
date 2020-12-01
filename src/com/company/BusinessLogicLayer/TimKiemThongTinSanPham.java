package com.company.BusinessLogicLayer;

import com.company.Entities.HoaDonBanHang;
import com.company.Entities.SanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class TimKiemThongTinSanPham {
    static Scanner scanner = new Scanner(System.in);

    public static void TimKiemSanPham(ArrayList<SanPham> sanPhamArrayList) {
        System.out.println("Nhập tên, mã sản phẩm hoặc mã loại");
        String keyword = scanner.nextLine();
        SanPham result = QuanLyThongTin.find(sanPhamArrayList, keyword);
        if (result == null) {
            System.out.println("Không tìm thấy sản phẩm");
        } else {
            System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n", "Mã loại", "Mã sản phầm", "Tên sản phẩm", "Giá bán", "Số lượng", "Đơn vị tính");

            QuanLyThongTin.display(result);

        }
    }
}
