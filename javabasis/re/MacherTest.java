package javabasis.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Edwin Xu on 9/8/2020 11:05 PM
 *
 *
 * 捕获组
 * 捕获组是把多个字符当一个单独单元进行处理的方法，它通过对括号内的字符分组来创建。
 *
 * 例如，正则表达式 (dog) 创建了单一分组，组里包含"d"，"o"，和"g"。
 *
 * 捕获组是通过从左至右计算其开括号来编号。例如，在表达式（（A）（B（C））），有四个这样的组：
 *
 * ((A)(B(C)))
 * (A)
 * (B(C))
 * (C)
 */
public class MacherTest {
    public static void main(String[] args) {
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }
}
