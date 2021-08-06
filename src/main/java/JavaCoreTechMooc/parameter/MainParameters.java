package JavaCoreTechMooc.parameter;

import java.lang.String;
import java.util.Arrays;

/**
 * Created by Edwin Xu on 5/8/2020 2:21 PM
 */
public class MainParameters {
    public static void main(String[] args) {

        Arrays.asList(args).forEach(System.out::println);
    }
}
