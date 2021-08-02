package collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Edwin Xu
 * @date 6/2/2021 5:27 PM.
 *
 * 使用自定义的类作为Key
 *
 * 需要注意的事项
 */

public class MyKeyHashMap {

    public static void main(String[] args) {
        Map<MyKey, Integer> map = new HashMap<MyKey, Integer>();

    }





}

class MyKey{
    private int val;
    public MyKey(int val){
        this.val = val;
    }
}

class MyValue{
    private int val;
    public MyValue(int val){
        this.val = val;
    }
}

