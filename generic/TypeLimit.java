package generic;

/**
 * Created by Edwin Xu on 4/28/2020 2:40 PM
 */
class A {
    int a;
}

class B<T extends A>{
    public B( ){
        System.out.println("Son_SamePkg init");
    }
}

class C extends A{

}

//class D<T super >{
//  我的版本太低？？？
//}

public class TypeLimit {
    public static void main(String[] args) {
//        Son_SamePkg<Integer> b = new Son_SamePkg<>(); err
        B<C> b = new B<>();

//        D<Father> c =
    }
}
