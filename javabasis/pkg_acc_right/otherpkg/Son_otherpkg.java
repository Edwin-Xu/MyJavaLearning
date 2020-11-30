package javabasis.pkg_acc_right.otherpkg;

import javabasis.pkg_acc_right.samepkg.Father;

import java.lang.String;

/**
 * Created by Edwin Xu on 8/25/2020 12:58 PM
 */
public class Son_otherpkg extends Father {

    public Son_otherpkg() {
        int c = this.c+this.d;
    }

    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.d);
        System.out.println(father.d);
    }
}
