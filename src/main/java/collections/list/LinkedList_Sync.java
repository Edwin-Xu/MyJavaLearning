package collections.list;

import java.lang.String;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Edwin Xu on 6/26/2020 1:29 PM
 */
public class LinkedList_Sync implements Runnable{
    @Override
    public void run(){
        while (true){
            list.add(1);
            System.out.print(list.size()+" ");
            list.pop();
            System.out.println(list.size());
        }
    }

    private static LinkedList<Integer> list = new LinkedList<>();
    /*
    * LinkedList是线程不安全的。
    *
    * 创建的时候构造线程安全的：
    *   Collections.synchronizedList()
    * */
    private static List<Integer> L = Collections.synchronizedList(list);


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new LinkedList_Sync().run();
        }
    }


}
