package io.nio;

import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Edwin Xu on 9/13/2020 10:56 AM
 */
public class NioFllesTest {

    public void read_write(String filePath) throws Exception{
        // 写入文件（追加方式：StandardOpenOption.APPEND）
        Files.write(Paths.get(filePath),
                "this is content append by edwin xu".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

        // 读取文件
        byte[] data = Files.readAllBytes(Paths.get(filePath));
        System.out.println(new String(data, StandardCharsets.UTF_8));
    }

    public static void main(String[] args) {
        NioFllesTest nioFllesTest = new NioFllesTest();
        try {
//            nioFllesTest.read_write("D:\\Programming\\Java\\javaAdvancedWorkSpace\\src\\io\\nio\\a.txt");
            nioFllesTest.read_write("src/io/nio/a.txt"); //这个相对路径需要从src开始
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
