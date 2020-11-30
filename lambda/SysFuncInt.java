package lambda;

import java.lang.String;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by Edwin Xu on 5/3/2020 4:12 PM
 */
public class SysFuncInt {

    public static void main(String[] args) {
        Predicate<Integer> p = a->{
            if (a%2==0)return true;
            return false;
        };
        System.out.println(p.test(12));

        Consumer<Integer> c = a->{
            if (a%2==0) System.out.println(a +"是偶数");
        };
        c.accept(2);

        Supplier<Integer> s = ()-> (int)(Math.random()*100);
        System.out.println("随机生成:"+s.get());

        Function<Integer,Integer> f = a->a*100;
        System.out.println(f.apply(12));

    }
}
