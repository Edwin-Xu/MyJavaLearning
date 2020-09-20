package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Edwin Xu on 4/28/2020 1:33 PM
 */

class  MyGeneric<T>{
    private T id;
    public MyGeneric(T id){
        this.id = id;
    }
    public void print(){
        System.out.println(id.toString());
    }
}

public class Generic {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);

        //Generic Methods:
        int i =  Collections.binarySearch(a,1);
        //返回的是index
        System.out.println(i);
        System.out.println(a.get(i));


        //Generic Interface

        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        MyGeneric<String> myGeneric = new MyGeneric<>("EdwinXu");
        myGeneric.print();

    }
}
