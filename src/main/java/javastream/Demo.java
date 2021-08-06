package javastream;

import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by Edwin Xu on 5/3/2020 8:02 PM
 */
public class Demo {
    public static void main(String[] args) {
        Supplier<Integer> s = ()->(int)(10*Math.random());

        Integer [] a = new Integer[100000000];
        for (int i = 0; i < a.length; i++) {
            a[i]=s.get();
        }
        //@todo 找出大于5的个数

        //传统方法
        long begin = System.currentTimeMillis();
        int c=0;
        for (int i : a) {
            if (i>5)c++;
        }
        System.out.println(c);
        long end = System.currentTimeMillis();
        System.out.println(end-begin);

        //流：
        List<Integer> list= Arrays.asList(a);
        begin = System.currentTimeMillis();
        long count = list.stream().filter(x->x>5).count();
        System.out.println(count);
        end = System.currentTimeMillis();
        System.out.println(end-begin);

        //并行流
        begin = System.currentTimeMillis();
        long count2 = list.parallelStream().filter(x->x>5).count();
        System.out.println(count2);
        end = System.currentTimeMillis();
        System.out.println(end-begin);


    }
}
