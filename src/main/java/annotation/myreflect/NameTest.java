package annotation.myreflect;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by Edwin Xu on 10/9/2020 9:45 PM.
 */

public class NameTest {
//    @Name(name = "Joey")
    @Name
    public void showName() throws NoSuchMethodException{
        Class<NameTest> cls = NameTest.class;
        Method method = cls.getMethod("showName");
        /*
         自己解析注解。拿到注解中的名字
         这里实际分两步：Name n =  method.getAnnotation(Name.class);
                       String name = n.name();
         n是Name注解下的实现类：class $Proxy1 extends Proxy implements Name
         调用 n.name(), 实际调用 $Proxy1类的name()：
             public final String name() throws  {
                try {
                    return (String)super.h.invoke(this, m3, (Object[])null);
                } catch (RuntimeException | Error var2) {
                    throw var2;
                } catch (Throwable var3) {
                    throw new UndeclaredThrowableException(var3);
                }
            }
         然后通过反射来执行这个方法: m3 = Class.forName("annotation.myreflect.Name").getMethod("name");

         */
        String name =   method.getAnnotation(Name.class).name();
        System.out.println("Your Name Is "+name);
    }

    public static void main(String[] args) throws NoSuchMethodException{
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");

        NameTest nameTest = new NameTest();
        nameTest.showName();
    }
}
