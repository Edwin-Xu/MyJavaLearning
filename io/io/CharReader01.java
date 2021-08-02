package io.io;

import java.io.*;

/**
 * @author Edwin Xu
 * @date 7/11/2021 4:00 PM.
 */

public class CharReader01 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Programming\\Java\\javaAdvancedWorkSpace\\pom.xml";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))));

        byte [] bytes = new byte[1024];
        int read = 0;
        //reader.lines().forEach(System.out::println);

        char[] chars = new char[128];
        int read1 = reader.read(chars);

        System.out.println(String.valueOf(chars));



    }
}
