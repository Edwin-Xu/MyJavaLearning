package nestedClass;

import java.util.function.Consumer;

/**
 * @author taoxu.xu
 * @date 10/31/2021 6:19 PM
 */
public class InnerClass {
    public void test(Consumer<String> c, String s){
        c.accept(s);
    }
    public void test01(String s){
        int[] p = new int[10];
        test(new Consumer<String>() {
            @Override
            public void accept(String s) {
                p[0] ++ ;
                System.out.println(s);
            }
        }, "edw");
    }
}
