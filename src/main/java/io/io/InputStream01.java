package io.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Edwin Xu
 * @date 7/11/2021 4:07 PM.
 */

public class InputStream01 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Programming\\Java\\javaAdvancedWorkSpace\\pom.xml";

        FileInputStream inputStream = new FileInputStream(path);
        int read = 0;
        byte[] bytes = new byte[128];
        while ((read= inputStream.read(bytes))!=-1) {
            System.out.println(new String(bytes, 0, read));
        }






        B b = new B(10);
        System.out.println(b.getA());

    }

    static class A{
        private int a = 0;
        int b = 0;
        public A(int a_){
            a = a_;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }
    }
    static class B extends A{

        public B(int a_) {
            super(a_);
        }

    }
}
