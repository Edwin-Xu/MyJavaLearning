package lambda.sysfi;

import domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * @author Edwin Xu
 * @date 6/3/2021 7:40 PM.
 *
 * Represents a function that accepts one argument and produces a result.
 */
public class FunctionTest01 {
    public static <T extends Student> List<Optional<T>> getStudents(List<Integer> ids, Function<Integer, T> function){
        List<Optional<T>> optionalList = new ArrayList<>();
        for (Integer id : ids) {
            optionalList.add(Optional.of(function.apply(id)));
        }
        return optionalList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(100);
        ids.add(101);
        ids.add(102);

        // 函数式接口
        // List<Optional<Student>> students = FunctionTest01.getStudents(ids, new Function<Integer, Student>() {
        //     @Override
        //     public Student apply(Integer integer) {
        //         return new Student(integer);
        //     }
        // });

        // lambda表达式
        // List<Optional<Student>> students = FunctionTest01.getStudents(ids, integer -> new Student(integer));

        // 方法引用：Student::new  ！！！妙妙妙！！！
        List<Optional<Student>> students = FunctionTest01.getStudents(ids, Student::new);

        students.forEach(student -> System.out.println(student.toString()));
    }
}
