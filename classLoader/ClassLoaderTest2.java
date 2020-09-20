package classLoader;

/**
 * Created by Edwin Xu on 8/2/2020 3:46 PM
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
//        new ClassLoaderTest2(); //调用了类加载器，查看指令,看不到

        try {
            ClassLoader loader = ClassLoaderTest2.class.getClassLoader();
            loader.loadClass("classLoader.ClassLoaderTest2");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
