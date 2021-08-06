package syntax_sugar;

import java.lang.String;

/**
 * Created by Edwin Xu on 4/27/2020 11:41 PM
 *
 * 不定项参数
 */
public class Parameter {

    public  void f(String name, String ...args){
        System.out.println("有可变参数");
//        System.out.println("name: "+name);
//        System.out.println("参数Length： "+args.length);
//        for (String s: args){
//            System.out.println(s);
//        }
    }



    //重载：
    public  void f(String name){
        System.out.println("没有可变参数");
    }

    //重载：2
    public  void f(String a,String b){
        System.out.println("没有可变参数2");
    }
     //重载：3
    public  void f(String ...a){
        System.out.println("可变参数2");
    }



    public static void main(String[] args) {
        Parameter p = new Parameter();
//        p.f("EdwinXu","1","2","3","4");
        p.f("ed");
        p.f("ed,","We");
    }
}
