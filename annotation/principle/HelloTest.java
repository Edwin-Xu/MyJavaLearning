package annotation.principle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by Edwin Xu on 10/9/2020 7:26 PM.
 */

public class HelloTest {
    @Hello(value = "hi edwinxu")
    private String hi;

    @Hello("edwinxu")
    public static void main(String[] args) throws NoSuchMethodException{
        //Java动态代理生成的对象导出
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");

        Class<HelloTest> cls = HelloTest.class;
        Method method = cls.getMethod("main",String[].class);
        Hello hello = method.getAnnotation(Hello.class);
        System.out.println(hello.value()); //edwinxu

        System.out.println(new HelloTest().hi);//null, 注解没有被解析，自然没有用，

    }
}
