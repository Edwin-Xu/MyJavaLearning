package io.io;

import java.lang.String;
import java.util.Scanner;


/**
 * Created by Edwin Xu on 9/21/2020 3:48 PM
 */
public class ScannerTest {

    public static void main(String[] args) {
//        System.out.println(System.in);

        //必须要 使用空白字符串
        Scanner scanner = new Scanner(System.in).useDelimiter("\\sx\\s");
//        System.out.println(scanner);

//        System.out.println(scanner.nextInt());
//        System.out.println(scanner.next());
//        System.out.println(scanner.nextInt());


//
//        while (scanner.hasNext()){
//            System.out.println("input:"+scanner.next());
//        }
//


        int x = 1;
        System.out.println( (x=100)+x );


    }
}
