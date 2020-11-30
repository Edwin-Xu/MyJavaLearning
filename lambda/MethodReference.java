package lambda;

import java.lang.String;
import java.util.*;

/**
 * Created by Edwin Xu on 5/3/2020 4:26 PM
 */
public class MethodReference {
    public static void main(String[] args) {
        String s[] = {"sd","fgfgfg"};
        Arrays.sort(s,String::compareToIgnoreCase);
        for (String i:s) System.out.println(i);


        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(12);
        a.forEach(System.out::println);



        int arr[] = {1,1,1,1,23,2,32332,234,3,434,342,32,32,323,4,44,4};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.merge(i,1,Integer::sum);
        }

        for (Map.Entry<Integer,Integer> e : map.entrySet()) {
            System.out.println(e.getKey()+":"+e.getValue());
        }




        int [] arr1 = {1,2,2,3,3,3};
        Map<Integer,Integer> m = new HashMap<>();
        for (int i : arr1) {
            m.merge(i,1,(aa,b)->(aa+b));
//            m.merge(i,1,Integer::sum);
        }
        for (Map.Entry<Integer,Integer> e : m.entrySet()) {
            System.out.println(e.getKey()+":"+e.getValue());
        }




    }
}
