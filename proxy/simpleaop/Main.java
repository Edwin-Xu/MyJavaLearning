package proxy.simpleaop;
import java.lang.reflect.Proxy;
public class Main {
    public static void main(String[] args) {
        //创建目标对象
        PersonImpl edwinxu = new PersonImpl("Edwin0");
        //创建调用处理器对象
        PersonProxyHandler pph = new PersonProxyHandler(edwinxu);
        //动态生成代理对象
        Person personProxy = (Person) Proxy.newProxyInstance(
                PersonImpl.class.getClassLoader(),PersonImpl.class.getInterfaces(),pph
        );
        while (true){
            try {
                personProxy.eat();//执行关键业务代码
                edwinxu.setName("Edwin"+(int)(Math.random()*10));
                Thread.sleep(3000);
                System.out.println();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
