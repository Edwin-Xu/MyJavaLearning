package generic;

import java.lang.String;

/**
 * Created by Edwin Xu on 8/25/2020 2:11 PM
 */
public class MethodTest {
    public static  <T> T get(T a){
        return a;
    }

    public static void main(String[] args) {
        System.out.println(MethodTest.get("!2"));
        System.out.println(MethodTest.<Integer>get(12));
    }

}
