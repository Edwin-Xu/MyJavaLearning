package generic;

import domain.BachelorStudent;
import domain.Student;

import java.lang.reflect.Constructor;

/**
 * @author Edwin Xu
 * @date 6/2/2021 9:39 PM.
 */

public class MethodTest002 {

    public static <T extends Student> T getT(Class<T> clazz, int id) throws Exception{
        Constructor<T> constructor = clazz.getConstructor(int.class);
        return constructor.newInstance(id);
    }

    public static void main(String[] args) throws Exception{
        Student student = MethodTest002.getT(Student.class, 100);
        System.out.println(student.toString());

        BachelorStudent bachelorStudent = MethodTest002.getT(BachelorStudent.class, 0b100);
        System.out.println(bachelorStudent.toString());
    }
}
