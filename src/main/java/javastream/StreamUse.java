package javastream;

import java.lang.String;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Edwin Xu on 5/4/2020 9:24 AM
 */
public class StreamUse {
    public static void main(String[] args) {
        Integer []a = {1,2,3,4,5,6,7,8};
        Stream<Integer> stream = Stream.of(a);
//        stream.forEach(System.out::print);

        Stream<Integer> s1 =  stream.filter(x->x>3);
//        s1.forEach(System.out::print);

        Stream<Integer> s2 = s1.skip(1);
//        s2.forEach(System.out::print);

        Optional<Integer> s3 = s2.max((x, y)->x-y);
        System.out.println( s3.get());





    }
}
