package reflection.createInstance_4methods;

import java.io.*;
import java.lang.String;

/**
 * Created by Edwin Xu on 4/28/2020 4:52 PM
 * 对象的序列化是基于字节的，不能使用Reader和Writer等基于字符的层次结构
 */
public class Deserialization implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    public Deserialization(String name){
        this.name =name;
    }
    public void printName(){
        System.out.println("My Name Is "+name);
    }

    public static void main(String[] args) {
        try {
            Deserialization d = new Deserialization("Edwin");
            //序列化：打开一个流，写入
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
            out.writeObject(d);
            out.close();

            //反序列化:从流中取出来
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
            Deserialization d1 = (Deserialization)in.readObject();
            in.close();

            d1.printName();//My Name Is Edwin
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
