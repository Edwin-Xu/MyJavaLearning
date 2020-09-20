package lambda;

/**
 * Created by Edwin Xu on 5/3/2020 4:03 PM
 */
@FunctionalInterface
interface MFI{
    boolean test(int a);
}
public class MyFunctionalInterface {
    public static void main(String[] args) {
        //匿名内部类的形式
        MFI m = new MFI() {
            @Override
            public boolean test(int a) {
                if (a%2==0)return true;
                return false;
            }
        };
        System.out.println(m.test(12));
        //lambda表达式形式
        MFI m2 = a -> {
          if (a%2==0)return true;
          return false;
        };
        System.out.println(m2.test(123));
    }
}
