package javabasis.obj;

import util.PrintUtil;

/**
 * Created by Edwin Xu on 8/26/2020 2:01 PM
 */
class A{
    int n =0;
    public A(int nn){
        this.n =nn;
    }
    @Override
    public boolean equals(Object obj) {
        A a = (A)obj;
        return this.n==a.n;
    }
}
/*
* 对于两个对象： 如果equals没有被覆盖，或者覆盖后还是比较的对象地址，那么：
*   如果equals比较相同，那么hashCode一定相同。
*   如果equals比较不同，那么hashCode不需要相同。如果hashCode相同，有一定副作用，如对hashTable
*      有影响，可能会降低其效率，
*
*   因此：重写equals应同时重写hashCode，在集合类中不重写回导致错误，如HashMap存储自定义的对象，该
*   对象不重写hashCode的话，会导致相同值被存储多份
*
* */
public class ObjTest {
    public static void main(String[] args) {
        String a = "s";
        String b = new String("s");
        PrintUtil.print(a.equals(b),a.hashCode(),b.hashCode());

        A a1 = new A(1);
        A a2 = new A(1);
        PrintUtil.print(a1.equals(a2),a1.hashCode(),a2.hashCode());


    }
}
