package javastream;

import java.lang.String;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by Edwin Xu on 5/3/2020 8:33 PM
 */
public class StreamCreate {


    public static void main(String[] args) throws Exception{
        Stream<String> s1 = new ArrayList<String>().stream();
        Stream<Integer> s2 = new HashSet<Integer>().parallelStream();

        Integer []arr = {1,2};
        Stream<Integer> s3 = Arrays.stream(arr);

        Stream<Integer> s4 = Stream.of(arr);
        Stream<String> s5 = Stream.of("2,3,4".split(","));

        Stream<Integer> s6 = Stream.generate(()->(int)(Math.random()*100));
        Stream<Double> s7 = Stream.generate(Math::random);

        Stream<BigInteger> s8 = Stream.iterate(BigInteger.ONE,n->n.add(BigInteger.ONE));

        Stream<String> s9 = Files.lines(Paths.get("./x.txt"));
        Stream<String> s10 = Pattern.compile("\\w+").splitAsStream("ass");



//        output
        s1.forEach(System.out::println);
    }
}
