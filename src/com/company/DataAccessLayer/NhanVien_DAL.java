package com.company.DataAccessLayer;

import com.company.Entities.NhanVien;

import java.io.*;
import java.util.ArrayList;
//int manhanvien, String tennhanvien, String diachi, String sodienthoai, String email
public class NhanVien_DAL {
    static File file = new File("NhanVien.txt");
    public static void DocFile(ArrayList<NhanVien>shanVienArrayList) throws IOException {
        if(file.exists()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                int manv = Integer.parseInt(line.split("#")[0]);
                String tennv = line.split("#")[1];
                String diachi = line.split("#")[2];
                String sdt = line.split("#")[3];
                String email = line.split("#")[4];
                shanVienArrayList.add(new NhanVien(manv,tennv,diachi,sdt,email));
            }
            fileReader.close();
            bufferedReader.close();
        }
    }
    public static void GhiFile(ArrayList<NhanVien>shanVienArrayList) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (NhanVien shanVien:shanVienArrayList
        ) {
            fileWriter.write(shanVien.toString()+"\n");
        }
        fileWriter.close();
    }
}
