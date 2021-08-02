package lambda.sysfi;

import domain.Student;

import java.util.Optional;
import java.util.function.Predicate;

/**
 * @author Edwin Xu
 * @date 6/3/2021 7:20 PM.
 *
 *
 * Predicate
 */

public class PredicateTest01 {

    public static <T extends Student> Optional<T> test01(Predicate<T> pre, T obj){
        return pre.test(obj) ? Optional.of(obj) : Optional.empty();
    }

    public static void main(String[] args) {
        Optional<Student> edw = PredicateTest01.test01(student -> student.getAge() > 10,
                new Student(1, 100, "edw"));

        edw.ifPresent(student -> System.out.println(student.toString()));

    }
}
