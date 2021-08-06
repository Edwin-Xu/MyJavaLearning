package javabasis.override;

import java.lang.String;

/**
 * Created by Edwin Xu on 8/3/2020 10:02 AM
 *
 *  * 栈中存放一个个栈帧，每个栈帧对应着每个方法的每次调用，而栈帧又是
 *  * 由局部变量区和操作数栈两部分组成，局部变量区用于存放方法中的局部
 *  * 变量和参数，操作数栈中用于存放方法执行过程中产生的中间结果。
 */

/*
* 函数重载底层是怎么实现的？
*
* */
public class Override {

    /*
    *
    * Descriptor:描述方法的形参和返回值
    * */

    /*
    *   #12 = Utf8               (IF)V
  #13 = Utf8               a
  #14 = Utf8               I
  #15 = Utf8               b
  #16 = Utf8               F
  #17 = Utf8               (FI)I

    * */
    private static void f(int a,float b){
        //(IF)V: int\float是参数，Void是返回值
    }
    private static int f(float a,int b){
        return b;
        //(FI)I: float、int是形参，Int是返回值
    }



    /*
    *  public static void main(String[]);
    descriptor: ([Ljava/lang/String;)V

    * */
    public static void main(String[] args) {
        Override.f(1.0f,2);
        Override.f(1,2.0f);

        Override o = new Override();
        Integer a = 1;
        o.g(a);
        Object b = Integer.valueOf("111");
        o.g(b);
        System.out.println("------------");

//        Father a1 = new Father();
//        Father a2 = new Son_SamePkg();
//        Son_SamePkg a3 = new Son_SamePkg();
//        o.y(a1);
//        o.y(a2);
//        o.y(a3);
    }


    /*
    * 思考：继承关系是重载吗
    * */
    public void g(Object o){
        System.out.println("调用父类");
    }
    public void g(Integer o){
        System.out.println("调用子类");
    }
//
//    public void y(Father a){
//        System.out.println("调用父类");
//    }
//    public void y(Son_SamePkg a){
//        System.out.println("调用子类");
//    }

}

