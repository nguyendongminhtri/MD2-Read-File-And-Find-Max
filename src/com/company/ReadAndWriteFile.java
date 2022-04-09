package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public void readFileAndSum(String pathFile){
        try {
           File file = new File(pathFile);
           if(!file.exists()){
               throw new FileNotFoundException();
           }
           String line = "";
           int sum = 0;
           BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
           while ((line=bufferedReader.readLine())!=null){
               System.out.println(line);
              sum += Integer.parseInt(line);
           }
           bufferedReader.close();
            System.out.println("sum === "+sum);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    public List<Integer> readFile(String pathFile) {
        List<Integer> integerList = new ArrayList<>();
        try {
            File file = new File(pathFile);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line=bufferedReader.readLine())!=null){
                integerList.add(Integer.parseInt(line));
            }
            bufferedReader.close();

        } catch (Exception e){
            System.out.println("File không tồn tại");
        }
        return integerList;
    }
}
