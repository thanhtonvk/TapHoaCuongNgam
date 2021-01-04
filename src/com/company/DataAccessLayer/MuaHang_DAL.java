package com.company.DataAccessLayer;

import com.company.Entities.MuaHang;

import java.io.*;
import java.util.ArrayList;

public class MuaHang_DAL {
    static File file = new File("MuaHang.txt");
    public static void DocFile(ArrayList<MuaHang> muaHangs) throws IOException {
        if(file.exists()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                String[]arr = line.split("#");
                muaHangs.add(new MuaHang(arr[0],arr[1],Integer.parseInt(arr[2]) ));
            }
            fileReader.close();
            bufferedReader.close();
        }
    }
    public static void GhiFile(ArrayList<MuaHang>muaHangs) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (MuaHang muaHang:muaHangs
        ) {
            fileWriter.write(muaHang.toString()+"\n");
        }
        fileWriter.close();
    }
}
