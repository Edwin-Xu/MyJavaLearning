package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Edwin Xu
 * @date 6/2/2021 9:08 PM.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    protected int id;
    private int age;
    private String name;

    public Student(int id){
        this.id =id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
