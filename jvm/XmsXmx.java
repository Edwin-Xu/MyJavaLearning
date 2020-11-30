package jvm;

/**
 * Created by Edwin Xu on 9/28/2020 3:23 PM
 */
public class XmsXmx {
    public static void main(String[] args) {
        //-Xms30M -Xmx30M
//        byte b1[] = new byte[30 * 1024 * 1024];// 30 MB OOM

//        byte b2[] = new byte[20 * 1024 * 1024];//20 MB OK
        // 年轻代：老年代 = 1:2

//        byte b3[] = new byte[20 * 1024 * 1024 + 1];// 居然ok

//        byte b4[] = new byte[28 * 1024 * 1024 - 100];
        // 居然 OK： 基本装满了Eden和老年代

//        byte b5[] = new byte[28 * 1024 * 1024]; //OOM

        //所以一个大数组，最大大小约为 Eden+old


        System.out.println((int)1.5*1.5); //1.5
        System.out.println((int)(1.5*1.5));//2


    }
}
