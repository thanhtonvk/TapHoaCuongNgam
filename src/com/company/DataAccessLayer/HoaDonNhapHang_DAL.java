package com.company.DataAccessLayer;

import com.company.Entities.HoaDonNhapHang;

import java.io.*;
import java.util.ArrayList;

public class HoaDonNhapHang_DAL {
    static File file = new File("HoaDonNhapHang.txt");
    public static void DocFile(ArrayList<HoaDonNhapHang>hoaDonNhapHangArrayList) throws IOException {
        if(file.exists()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                String mahoadonnhap = line.split("#")[0];
                String ngaynhap = line.split("#")[1];
                String tenmathang = line.split("#")[2];
                double giaban = Double.parseDouble(line.split("#")[3]);
                int soluong = Integer.parseInt(line.split("#")[4]);

                hoaDonNhapHangArrayList.add(new HoaDonNhapHang(mahoadonnhap,ngaynhap,tenmathang,giaban,soluong));
            }
            fileReader.close();
            bufferedReader.close();
        }
    }
    public static void GhiFile(ArrayList<HoaDonNhapHang>hoaDonNhapHangArrayList) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (HoaDonNhapHang hoaDonNhapHang:hoaDonNhapHangArrayList
        ) {
            fileWriter.write(hoaDonNhapHang.toString()+"\n");
        }
        fileWriter.close();
    }
}
