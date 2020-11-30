package io.io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.String;
import java.util.Scanner;

/**
 * Created by Edwin Xu on 9/21/2020 4:58 PM
 */
public class ScannerFromFile {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("./src/io/a.txt");
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
