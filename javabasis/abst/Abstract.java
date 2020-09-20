package javabasis.abst;

import java.util.AbstractList;
import java.util.List;

/**
 * Created by Edwin Xu on 6/23/2020 8:46 PM
 */
public class Abstract {
    public static void main(String[] args) {
//        List
//        AbstractList

//        Runtime
    }
    /*
    *
    * 抽象类和接口：
    * 联用：提供一个接口(声明所有类型)、一个抽象基类按需实现该接口，从而让具体类继承抽象类而不是接口，从而不必实现全部方法减轻负担。
这样的例子是：java.util.List 接口和相应的 java.util.AbstractList 抽象类。

    * */

   abstract class  A{
       abstract void f();
   }
}
