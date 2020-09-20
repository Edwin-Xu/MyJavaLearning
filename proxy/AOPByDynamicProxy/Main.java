package proxy.AOPByDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;



public class Main {
	public static void initXml(){
		XmlReader.readXml("./src/proxy/AOPByDynamicProxy/aops.xml");
		ResourceListener.addListener("./src/proxy/AOPByDynamicProxy");
	}
	public static void main(String[] args) throws Exception{
		Main.initXml();		
		
		Person action = new PersonImpl(); //subject对象
		ProxyHandler mh = new ProxyHandler(action); //代理处理器
		ClassLoader cl = Main.class.getClassLoader();
		Class<?> proxyClass = Proxy.getProxyClass(cl, new Class<?>[]{Person.class});//Proxy new了一个$proxy
        Person proxy = (Person) proxyClass.getConstructor(new Class[]{InvocationHandler.class}).
                newInstance(new Object[]{mh});//生成代理
        
        while(true)
        {
			proxy.eat();
			try{
				Thread.sleep(3000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
