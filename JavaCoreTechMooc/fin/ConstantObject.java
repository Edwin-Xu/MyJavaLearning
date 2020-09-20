package JavaCoreTechMooc.fin;

/**
 * Created by Edwin Xu on 5/8/2020 10:12 PM
 */
public class ConstantObject {
    public static void main(String[] args) {
        Integer a = new Integer(12);
        a = 23;
        a = new Integer(3434);
        System.out.println(a);



        String s= "0";
        String s1 = s;
        System.out.println(s1);//0
        s = "3";//s是一个新对象了
        System.out.println(s1);//0

        String ss="--";
        f(ss);
        System.out.println(ss);//--
    }

    public static void f(String s){
        s="new";
    }
}
