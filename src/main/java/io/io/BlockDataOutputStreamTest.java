package io.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author taoxu.xu
 * @date 8/10/2021 6:37 PM
 */
public class BlockDataOutputStreamTest {

    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);

        final ByteArrayOutputStream bout = new ByteArrayOutputStream(2);
        bout.write("123456".getBytes());

        final byte[] bytes = bout.toByteArray();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }


    }
}
