package classLoader;

/**
 * Created by Edwin Xu on 8/2/2020 2:53 PM
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        System.out.println(cl); //当前类加载器是 应用类加载器
        System.out.println(cl.getParent()); //同时使用了扩展/平台类加载器
        System.out.println(cl.getParent().getParent());
        //没有使用引导类加载器? no,是因为她是用C语言实现的，
        //找不到一个确定的返回父Loader的方式，于是就返回null。
        /*
        * jdk.internal.loader.ClassLoaders$AppClassLoader@442d9b6e
          jdk.internal.loader.ClassLoaders$PlatformClassLoader@61064425
          null
        * */
    }
}
