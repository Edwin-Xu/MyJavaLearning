package syntax_sugar.foreach;

import java.util.List;

/**
 * @author taoxu.xu
 * @date 9/10/2021 11:05 PM
 */
public class ForEachTest {
    public void test(List<Integer> list){
        list.forEach(System.out::print);
    }

    public static void main(String[] args) {

    }
}
