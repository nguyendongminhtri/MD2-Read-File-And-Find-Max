package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH = "E:\\CODEGYM\\C0222I1\\MD2\\MaxReadWriteFile\\src\\com\\company\\data\\numbers.txt";
        System.out.println(readAndWriteFile.readFile(PATH));
        System.out.println("Đọc file và tính tổng: ");
        readAndWriteFile.readFileAndSum(PATH);
        List<Integer> integerList = readAndWriteFile.readFile(PATH);
        int max = findMax(integerList);
        System.out.println("max === "+max);
    }

    private static int findMax(List<Integer> integerList) {
        int max = integerList.get(0);
        for (int i = 0; i < integerList.size(); i++) {
            if(max< integerList.get(i)){
                max = integerList.get(i);
            }
        }
        return max;
    }
}
