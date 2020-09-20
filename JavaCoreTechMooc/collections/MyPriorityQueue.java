package JavaCoreTechMooc.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Edwin Xu on 5/12/2020 9:06 PM
 *
 * 是使用堆实现的，具有堆的属性：堆顶容易找到
 */
public class MyPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer>  q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        q.offer(2);
        q.offer(23);
        q.offer(-2);
        q.offer(442);
        q.offer(-23434);
        Arrays.asList(q).forEach(System.out::print);
        //并没有保证从大到小的顺序，原因在于最小堆

        System.out.println("size:"+q.size());
        for (int i = 0; i <q.size() ; i++) {
            System.out.println(q.poll());
        }

    }
}
