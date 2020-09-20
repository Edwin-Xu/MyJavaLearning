package javabasis.trycatchfinally;


/**
 * Created by Edwin Xu on 6/19/2020 10:55 PM
 */
public class Finally {
    public static int test() {
        int i = 1;
// if(i == 1)
// return 0;
        System.out.println("the previous statement of try block");
        i = i / 0;
        try {
            System.out.println("try block");
            return i;
        } finally {
            System.out.println("finally block");
        }
    }

    public static int f() {
        try {
            System.out.println(1);
            return 1;
        } catch (Exception e) {

        } finally {
            System.out.println("f");
//            return 100;

        }
        return 2;
    }
    public static int show() {
        int result = 0;
        try {
            return result;
        }finally{
            System.out.println("finally模块被执行");
            result = 1; //并不会改变返回值
        }
    }
    public static void main(String[] args) {
        System.out.println(Finally.f());
        System.out.println(Finally.show());
    }
}
