package javabasis.override;

import java.lang.String;

/**
 * Created by Edwin Xu on 8/7/2020 4:44 PM
 */
public class OverrideTest {
    public void f(Father father){

    }
    public void f(Son son){

    }

    public static void main(String[] args) {
        OverrideTest ot = new OverrideTest();
          Father f = new Son();
          ot.f(f);
    }
}
class Father{

}
class Son extends Father{

}
