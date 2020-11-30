package io.io;

import java.io.Console;
import java.lang.String;

/**
 * Created by Edwin Xu on 5/12/2020 6:28 PM
 * console从控制台读取
 * 不显示
 * 没搞懂
 */
public class ConsoleTest {
    public static void main(String[] args) {
        Console in =  System.console();

        if (in!=null){
            String name = in.readLine("姓名：");
            String pw = in.readLine("密码:");
            System.out.println(name+" : "+pw);
        }else{
            System.out.println("in is null");
        }

    }
}
