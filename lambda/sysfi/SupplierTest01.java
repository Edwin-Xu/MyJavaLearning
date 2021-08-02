package lambda.sysfi;

import domain.Student;

import java.util.function.Supplier;

/**
 * @author Edwin Xu
 * @date 6/3/2021 8:06 PM.
 *
 * Represents a supplier of results.
 */
public class SupplierTest01 {

    public static <T extends Student> T get(Supplier<T> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        // () -> new Student() 改为方法引用
        Student student = SupplierTest01.get(Student::new);
        System.out.println(student.toString());
    }
}
