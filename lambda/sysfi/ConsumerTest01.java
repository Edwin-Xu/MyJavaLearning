package lambda.sysfi;

import domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Edwin Xu
 * @date 6/3/2021 7:32 PM.
 */

public class ConsumerTest01 {
    public static <T extends Student> void test01(List<T> tList, Consumer<T> consumer){
        for (T t : tList) {
            consumer.accept(t);
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student());
        students.add(new Student(1, 12, "edw01"));
        students.add(new Student(2, 120, "edw03"));
        students.add(new Student(3, 1200, "edw02"));

        ConsumerTest01.test01(students, student -> {
            if (student.getAge()>100){
                System.out.println(student.getName() +" 100多岁了");
            }else{
                System.out.println(student.getName()+"小伙子没满100岁");
            }
        });
    }
}
