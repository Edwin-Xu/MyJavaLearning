package classLoader;

/**
 * Created by Edwin Xu on 8/2/2020 1:03 PM
 *
 * 类的加载：加载、连接（验证、准备、解析）、初始化、使用、卸载
 *
 * 加载：
 *   通过类全路径找到字节流，加载到JVM中的方法区，然后在堆中开辟一个Class对象，
 *   封装方法区中类数据，同时提供访问入口。（该Class对象并不存储类信息）
 *
 *
 * 验证阶段：
 * 验证被加载类的正确性
 * - 文件格式验证：是否符合class文件规范
 * - 元数据验证：验证类变量信息
 * - 字节码验证：验证类方法
 * - 符号引用验证
 *
 *  -Xverify:none  用来关闭大部分验证过程，以节约时间
 *
 *javac -encoding utf-8 -d ./   Verify.java
 * java -Xverify:none  classLoader/Verify
 */


public class Verify {
    private int hello;
    public void setHello(){
        System.out.println(hello);
    }

    public static void main(String[] args) {
        new Verify().setHello();
    }
}
