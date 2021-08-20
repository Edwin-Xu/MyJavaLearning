# 动态代理模拟简单的AOP
>参照MOOC<java核心技术高阶>，使用java动态代理来实现一个简单的AOP
# AOP vs. OOP
OOP
> 面向对象编程，将功能需求划分为独立的、不同的、功能完善的类，通过继承、多态等方式实现相同或者不同的行为

AOP
> 面向切面编程，将**通用**的需求功能从众多类中提取出来，使得众多类共享一个行为。

关系
> AOP是OOP的补充  
OOP的不足之一关键业务和非关键业务的耦合。  
如雇员类Employee，核心业务是work,非核心的业务(高可变性)是记录(record) work前
后的状态信息，比如开始时间、使用的工具等，随着需求可能不断变化。
如果只使用OOP，那么要把非关键业务代码record写入类中，一方面是耦合性高，另一方面是这种
高可变性的业务可能造成修改频繁，难以维护。  
如何将非关键业务从耦合中分离出来，统一管理，便于修改？ --AOP

>怎么实现AOP?  
java动态代理的特性很适合AOP。  
动态代理会拦截特定的方法调用，进行加工(添加非关键的业务)，在调用真正的业务方法。

# 利用动态代理实现一个SimpleAOP
场景描述：
> 有Person类，关键业务是eat，非关键业务是在eat之前洗手(wash hands),
eat之后擦嘴(wipe mouth)

具体步骤:   
1- 创建Person接口
```java
public interface Person {
    void eat();
    String getName();
}
```
2- 实现Person
```java
public class PersonImpl implements Person {
    private String name;
    public PersonImpl(String name){
        this.name =name;
    }
    @Override
    public void eat(){
        System.out.println(name+" is eating!");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```
3- 创建调用处理器(实现InvocationHandler)
```java
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
public class PersonProxyHandler implements InvocationHandler {
    private Person person;//持有真正被调用的对象
    public PersonProxyHandler(Person p){
        this.person=p;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        //before eat
        System.out.println(person.getName()+" is washing hands!");
        //eat
        Object res = method.invoke(person,args);
        //after eat
        System.out.println(person.getName()+" is wiping mouth!");
        return res;
    }
}
```
4- 生成动态代理并调用方法
```java
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
```

特殊说明:
>要模仿AOP，按道理理应使用配置文件形式，但是这里简化了。

输出:
```text
Edwin0 is washing hands!
Edwin0 is eating!
Edwin0 is wiping mouth!

Edwin5 is washing hands!
Edwin5 is eating!
Edwin5 is wiping mouth!
```

可见通过动态代理，在关键业务(eat)上添加了一些其他的高可变的非关键业务。









