package classLoader;

/**
 * Created by Edwin Xu on 8/2/2020 3:00 PM
 */
class Test {
    static {
        System.out.println("i am a static init sentence!");
    }
}

public class ThreeWaysToLoadClass {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = Test.class.getClassLoader();
        System.out.println(loader);
        System.out.println("---------------------");
        //一、 使用ClassLoader.loadClass()来加载类，不会执行初始化块
        loader.loadClass("classLoader.Test");
        System.out.println("---------------------");

        // 二、 使用Class.forName()来加载类，默认会执行初始化块
        Class.forName("classLoader.Test");
        System.out.println("---------------------");

//        // 三、使用Class.forName()来加载类，指定ClassLoader，初始化时不执行静态块
        Class.forName("classLoader.Test", false, loader);
        System.out.println("---------------------");

        // 三、使用Class.forName()来加载类，指定ClassLoader，初始化时不执行静态块
        Class.forName("classLoader.Test", true, loader);


    }
}


