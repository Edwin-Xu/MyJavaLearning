package util;


/**
 * Created by Edwin Xu on 8/26/2020 2:02 PM
 */
public class PrintUtil {
    public static void print(Object ... objects){
        for (Object o:objects) {
            System.out.print(o);
            System.out.print("\t");
        }
        System.out.println();
    }
}
