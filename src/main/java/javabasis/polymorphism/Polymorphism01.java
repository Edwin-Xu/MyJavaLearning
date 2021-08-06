package javabasis.polymorphism;

/**
 * @author Edwin Xu
 * @date 7/10/2021 11:33 PM.
 */

class Father{
    public void move(){
        System.out.println("father moving");
    }

}
class Son extends Father {
    @Override
    public void move(){
        System.out.println("son moving");
    }
    public void eat(){
        System.out.println("son eating");
    }
}
/**
 * 编译看左边，运行看右边————多态  Polymorphism
 * */
public class Polymorphism01 {
    public static void main(String[] args) {
        Father father = new Father();
        Father son = new Son();

        father.move();
        son.move();

        //son.eat(); Error
        
        ((Son) son).eat();
    }
}
