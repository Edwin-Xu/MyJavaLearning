package javabasis.pkg_acc_right.samepkg;

/**
 * Created by Edwin Xu on 8/25/2020 1:01 PM
 */
public class NotSom_SamePkg {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.b);
        System.out.println(father.c);
        System.out.println(father.d);
        /*
        * 访问不到private
        * */
    }
}
