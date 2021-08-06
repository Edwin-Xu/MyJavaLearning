package reflection.construction;

import domain.Student;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Edwin Xu
 * @date 6/2/2021 9:07 PM.
 */

public class ConstructorTest {

    public static  <T> T getObj(Class<T> type, int param) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return type.getConstructor(int.class).newInstance(param);
    }

    public static void main(String[] args) throws Exception{
        for (int i = 0; i <10 ; i++) {
            Student student = ConstructorTest.getObj(Student.class, i);
            System.out.println(student.hashCode());
        }

    }
}


