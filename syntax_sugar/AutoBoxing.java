package syntax_sugar;

import java.lang.String;

/**
 * Created by Edwin Xu on 4/27/2020 11:57 PM
 */
public class AutoBoxing {
    public static void main(String[] args) {
//        自动装箱
        Integer x = 5;
//        手动装箱
        Integer x_ = Integer.valueOf(5);

//        自动拆箱
        int y =x;
//        手动拆箱
        int y_ = x.intValue();

        System.out.println(x+""+x_);


        int a = 1;
        int b = 1;
        System.out.println(a==b);//true
        Integer c = 1;
        Integer d = 1;
        System.out.println(c==d);//true:先拆箱再比较
        //和其他类不一样，并非是比较地址

        Integer e = 1;
        Long f = 1L;
//        System.out.println(e==f);


    }

}
