package proxy.simpleaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonProxyHandler implements InvocationHandler {
    private Person person;
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
