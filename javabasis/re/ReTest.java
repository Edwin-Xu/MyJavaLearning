package javabasis.re;

import util.PrintUtil;

import java.lang.String;

/**
 * Created by Edwin Xu on 9/8/2020 11:33 PM
 */
public class ReTest {
    public static void matches(String str, String re){
        PrintUtil.print(str,re,":",str.matches(re));
    }
    public static void main(String[] args) {
        ReTest.matches(".com","^\\.com");
        ReTest.matches("abcdce",".*(de)$");
        ReTest.matches("c","c?");
        ReTest.matches("","c?");
        ReTest.matches("cccc","c{1,5}");
        ReTest.matches("xa","x(a|b)");
        ReTest.matches("xb","x(a|b)");
        ReTest.matches("123","[0-9]");
        ReTest.matches("123","[^0-9]");
        ReTest.matches("123","\\d+");
        ReTest.matches("1","\\d");
        ReTest.matches("\n","\\n");
        ReTest.matches("    ","\\s+");
        ReTest.matches("   \n ","\\s+");
        ReTest.matches("gkbk    ","\\S+");
        ReTest.matches("gkbk","\\S+");



    }
}
