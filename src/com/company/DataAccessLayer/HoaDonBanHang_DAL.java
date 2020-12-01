package com.company.DataAccessLayer;

import com.company.Entities.HoaDonBanHang;

import java.io.*;
import java.util.ArrayList;

public class HoaDonBanHang_DAL {
    static File file = new File("HoaDonBanHang.txt");
    public static void DocFile(ArrayList<HoaDonBanHang>hoaDonBanHangArrayList) throws IOException {
        if(file.exists()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                String mahoadon = line.split("#")[0];
                String makhachhang = line.split("#")[1];
                String ngayban = line.split("#")[2];
                String tenmathang = line.split("#")[3];
                double giaban = Double.parseDouble(line.split("#")[4]);
                int soluong = Integer.parseInt(line.split("#")[5]);

                hoaDonBanHangArrayList.add(new HoaDonBanHang(mahoadon,makhachhang,ngayban,tenmathang,giaban,soluong));
            }
            fileReader.close();
            bufferedReader.close();
        }
    }
    public static void GhiFile(ArrayList<HoaDonBanHang>hoaDonBanHangArrayList) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (HoaDonBanHang hoaDonBanHang:hoaDonBanHangArrayList
        ) {
            fileWriter.write(hoaDonBanHang.toString()+"\n");
        }
        fileWriter.close();
    }
}
