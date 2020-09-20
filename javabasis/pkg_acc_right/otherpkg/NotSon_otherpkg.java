package javabasis.pkg_acc_right.otherpkg;

import javabasis.pkg_acc_right.samepkg.Father;

/**
 * Created by Edwin Xu on 8/25/2020 12:59 PM
 */
public class NotSon_otherpkg {

    public NotSon_otherpkg() {
    }
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.d);
        /*
        * 其他包非子类，只能访问public
        * */
    }
}
