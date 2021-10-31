package collections.map;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Edwin Xu on 8/3/2020 6:44 PM
 */
public class TreeMapTest {
    public static void main(String[] args) {
//        TreeMap
//        SortedMap

        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(3, 3);
        map.put(2, 2);
        map.put(1, 1);
        /*
         * 天生排序
         * 红黑树
         * 性能稍差
         * */
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
        }
        final Collection<Integer> values = map.values();




    }
}
