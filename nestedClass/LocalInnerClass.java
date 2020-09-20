package nestedClass;

/**
 * Created by Edwin Xu on 5/3/2020 1:31 PM
 *
 * 局部内部类：
 *
 */
public class LocalInnerClass {
    String name = "edwin 0";
    public void f(){
        String name = "edwin 1";
        class Inner1{
//            static int a = 1;
            final int b = 1;
            final static int c= 1;
            String name = "edwin 2";
            public void inner_f(int n){
                System.out.println(name);  //2
                System.out.println(this.name); //2
//                System.out.println(LocalInnerClass.name); wrong
                System.out.println(LocalInnerClass.this.name); //0
                if (n>0){
                    class Inner2{}
                    Inner2 i2 = new Inner2();
                }
            }
        }
        Inner1 i1 = new Inner1();
        i1=  new Inner1();
        i1.inner_f(1);
    }


    public static void main(String[] args) {
        LocalInnerClass li = new LocalInnerClass();
        li.f();
    }
}
/*
* 总结：
* - 局部内部类：
* - 生命周期 代码块
* - 可以访问外部
*   - 静态对静态
* - 不能定义静态方法 变量
* - 可以定义final常量
* - 不能是接口
* - 可以继承、实现
* - 编译后名称：外部类+$+序号+内部类名称
*
*
* */