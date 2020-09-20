package lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Edwin Xu on 5/3/2020 3:05 PM
 */

public class Compare {

    public void f(){
        //排序整数
        Integer arr[]  = {1,2,3,34,2,-23,30,-34,90};//不能使用基本类型，是泛型
        Arrays.sort(arr);//默认从小到大
        for (int i :arr)System.out.print(i);
        System.out.println();

        //使用自定义比较器
        class MyCompare implements Comparator<Integer>{
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        }
        Arrays.sort(arr,new MyCompare());
        for (int i :arr) System.out.print(i);
        System.out.println();
        //使用lambda表达式
        Arrays.sort(arr,(a,b)->a-b);
        for (int i :arr)System.out.print(i);
        System.out.println();

        Arrays.sort(arr,
                (a,b)->{
                   int a_ = a;
                   int b_ = b;
                   return b_-a_;
                });

        for (int i :arr)System.out.print(i);
        System.out.println();

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for (int i :arr)System.out.print(i);
        System.out.println();

    }

    public static void main(String[] args) {
        new Compare().f();
    }

}
