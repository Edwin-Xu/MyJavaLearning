package javabasis.pkg_acc_right.samepkg;

/**
 * Created by Edwin Xu on 8/25/2020 12:54 PM
 */
public class Son_SamePkg extends Father {
    /*
    * 本包的其他类(包括子类)：最大可以访问default权限
    * */

    public Son_SamePkg() {
        int s = this.b+this.c+this.d;
    }

    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.b);
        System.out.println(father.c);
        System.out.println(father.d);
    }
}
