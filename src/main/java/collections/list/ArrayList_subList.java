package collections.list;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edwin Xu on 9/27/2020 4:09 PM
 */
public class ArrayList_subList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList.size());//10

        List<Integer> subList = arrayList.subList(0,5);
        subList.remove(0);
        subList.remove(1);

        System.out.println(arrayList.size());//8!!!

    }
}
