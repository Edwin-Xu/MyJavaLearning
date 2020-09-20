package bytecode.jclasslib;

/**
 * Created by Edwin Xu on 8/27/2020 6:58 PM
 */
public class JClassLibTest {
    static {
        a = 100;
    }
    public static int a = 1;

    /*
    * 赋值后a=1
    *
    * 类加载分为三个阶段，连接中，先分配空间，于是static声明语句可以放在后面。
    * 分配空间后a=0
    * 在初始化阶段,clinit会寻找赋值语句，然后初始化
    * 这里a=100先，a=1后，故最终a=1
    * */
    public static void main(String[] args) {

    }
}
