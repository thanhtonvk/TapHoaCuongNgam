package com.company.DataAccessLayer;

import com.company.Entities.SanPham;

import java.io.*;
import java.util.ArrayList;
//String maloai, String masanpham, String tensanpham, double giaban, int soluong, String donvitinh
public class SanPham_DAL {
    static File file = new File("SanPham.txt");
    public static void DocFile(ArrayList<SanPham>sanPhamArrayList) throws IOException {
        if(file.exists()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                String maloai = line.split("#")[0];
                String masanpham = line.split("#")[1];
                String tensanpham = line.split("#")[2];
                double giaban = Double.parseDouble(line.split("#")[3]);
                int soluong = Integer.parseInt(line.split("#")[4]);
                String donvitinh = line.split("#")[5];
                sanPhamArrayList.add(new SanPham(maloai,masanpham,tensanpham,giaban,soluong,donvitinh));
            }
            fileReader.close();
            bufferedReader.close();
        }
    }
    public static void GhiFile(ArrayList<SanPham>sanPhamArrayList) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (SanPham sanPham:sanPhamArrayList
             ) {
            fileWriter.write(sanPham.toString()+"\n");
        }
        fileWriter.close();
    }
}
