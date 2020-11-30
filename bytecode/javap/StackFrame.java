package bytecode.javap;

import java.lang.String;

/**
 * Created by Edwin Xu on 8/3/2020 12:17 AM
 *
 * 栈中存放一个个栈帧，每个栈帧对应着每个方法的每次调用，而栈帧又是
 * 由局部变量区和操作数栈两部分组成，局部变量区用于存放方法中的局部
 * 变量和参数，操作数栈中用于存放方法执行过程中产生的中间结果。
 *
 */
public class StackFrame {
    public static void main(String[] args) {
        int i=0;
        i++;
        System.out.println(i);
    }
}
