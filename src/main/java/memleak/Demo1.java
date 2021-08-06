package memleak;

import java.util.*;

/**
 * Created by Edwin Xu on 10/15/2020 7:24 PM.
 *
 * 内存泄漏案例
 *
 */
class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        return super.hashCode()&name.hashCode();
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<Person>();
        Person p1 = new Person("唐僧");
        Person p2 = new Person("孙悟空");
        Person p3 = new Person("猪八戒");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set.size() ); //3

        p3.setName("ssd"); // 修改p3的年龄,此时p3元素对应的hashcode值发生改变

        set.remove(p3); //此时remove不掉，造成内存泄漏
        System.out.println(set.size() ); //3

        set.add(p3); //重新添加，居然添加成功
        System.out.println(set.size() );  //4

        /*
        *   总共有:3 个元素!
            总共有:2 个元素!
            总共有:3 个元素!
            memleak.Person@13b6d03
            memleak.Person@282ba1e
            memleak.Person@75412c2f
        * */

    }
}

/*
 * 这个例子不对的,
 * 因为这三个属性并没有参与hashcode的计算
 *
 * */