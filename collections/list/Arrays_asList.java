package collections.list;

import java.util.*;

/**
 * Created by Edwin Xu on 10/7/2020 11:08 PM.
 */

public class Arrays_asList {
    /*
    * Arrays.asList 不支持扩容，操作有限。
    * */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer(1));
        System.out.println( list.isEmpty() ); //false
//        list.add(1); //java.lang.UnsupportedOperationException
        list.remove(0);
    }
}
