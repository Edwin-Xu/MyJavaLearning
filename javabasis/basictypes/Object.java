package javabasis.basictypes;

import java.lang.String;

/**
 * Created by Edwin Xu on 5/12/2020 10:18 PM
 */
public class Object {
    @Override
    public boolean equals(java.lang.Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
//        return (int)(Integer.MAX_VALUE*Math.random());
        return super.hashCode();
    }

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        //同一对象返回相同hashCode值
        System.out.println(o1.hashCode()==o1.hashCode());

        System.out.println(o1.equals(o2));

//        如果两个对象被 equals() 方法视为相等，那么对这两个对象调用 hashCode()
// 必须获得相同的整数结果。？？？
        System.out.println(o1.hashCode()==o2.hashCode());

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());





        int c = 1_2_3;
        int x = 0b1111111111;
        int d = 0xFF;

    }
}
