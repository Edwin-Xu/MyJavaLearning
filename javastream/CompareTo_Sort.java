package javastream;

import java.lang.String;
import java.util.Arrays;

/**
 * Created by Edwin Xu on 5/3/2020 10:27 PM
 */
public class CompareTo_Sort {
    class Cat implements Comparable<Cat>{
        public int age;
        public Cat(int age){this.age=age;}

        @Override
        public int compareTo(Cat o) {
            return this.age-o.age;
        }
    }

    /*
    * Cat若要比较，必须实现Comparable接口
    *
    * */

    public static void main(String[] args) {
        Cat[] cats =new Cat[3];
        CompareTo_Sort cts = new CompareTo_Sort();
        cats[0] = cts.new Cat(12);
        cats[1] = cts.new Cat(102);
        cats[2] = cts.new Cat(-12);
        Arrays.sort(cats);

        Arrays.asList(cats).forEach((cat)->{
            System.out.println(cat.age);
        });
    }



}
