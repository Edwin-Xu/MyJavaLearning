package collections.cow;

import java.lang.String;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Edwin Xu on 9/20/2020 3:49 PM
 *
 * COW
 * 使用的时候复制一份 然后操作
 *
 */
public class CopyOnWriteArrayListTest {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.add(1,2);

        System.out.println(copyOnWriteArrayList.get(0));
        System.out.println(copyOnWriteArrayList.get(1));
//        System.out.println(copyOnWriteArrayList.get(2));


    }
}
