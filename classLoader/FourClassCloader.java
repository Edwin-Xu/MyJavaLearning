package classLoader;

/**
 * Created by Edwin Xu on 5/4/2020 2:15 PM
 *
 * 启动类加载器 Bootstrap
 * 扩展类加载器 Extension
 * 应用类加载器 APP
 * 自定义类加载器 Plugin
 *
 */
public class FourClassCloader {

    public static void main(String[] args) {
        ClassLoader cl = ClassLoader.class.getClassLoader();
        while (cl!=null){
            System.out.println(cl.getClass().getName());
            cl = cl.getParent();
        }
        if (cl==null){
            System.out.println("BootstrapLoader是C语言写的，没有类名");
        }
    }
}
