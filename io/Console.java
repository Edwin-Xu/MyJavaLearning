package io;

/**
 * Created by Edwin Xu on 5/12/2020 6:28 PM
 * console从控制台读取
 * 不显示
 * 没搞懂
 */
public class Console {
    public static void main(String[] args) {
        java.io.Console in =  System.console();
        System.out.println(in==null);
        String name = in.readLine("姓名：");
        String pw = in.readLine("密码:");
        System.out.println(name+" : "+pw);
    }
}
