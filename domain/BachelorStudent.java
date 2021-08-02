package domain;

/**
 * @author Edwin Xu
 * @date 6/2/2021 9:42 PM.
 */

public class BachelorStudent extends Student{
    private String college;

    public BachelorStudent(int id) {
        super(id);
    }


    @Override
    public String toString() {
        return "BachelorStudent{" +
                "college='" + college + '\'' +
                ", id=" + id +
                '}';
    }
}
