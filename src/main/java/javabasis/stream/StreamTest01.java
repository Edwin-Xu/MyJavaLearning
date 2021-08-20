package javabasis.stream;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

/**
 * @author taoxu.xu
 * @date 8/9/2021 9:48 AM
 */
public class StreamTest01 {
    @AllArgsConstructor
    @Data
    private static final class Student {
        String name;
        int age;
        String sex;
    }


    public static void main(String[] args) {
        List<Student> studentList = init();
        final Map<String, List<Student>> groupBy = groupBySex(studentList);
        groupBy.forEach((s, students) -> System.out.println(s+":"+ students.size()));
    }

    public static List<Student> init() {
        return Arrays.asList(
                new Student("小明", 168, "男"),
                new Student("大明", 182, "男"),
                new Student("小白", 174, "男"),
                new Student("小黑", 186, "男"),
                new Student("小红", 156, "女"),
                new Student("小黄", 158, "女"),
                new Student("小青", 165, "女"),
                new Student("小紫", 172, "女"));
    }

    public static Map<String, List<Student>> groupBySex(List<Student> studentsList) {
        return studentsList
                .stream()
                .collect(Collectors.groupingBy(Student::getSex));
    }

    public static List<Student> filterByAgeGh(List<Student> studentsList, int ghAge) {
            return studentsList
                .stream()
                .filter(student -> student.getAge() > ghAge)
                .collect(Collectors.toList());
    }

    public static void total(List<Student> studentsList) {
        int totalHeight = studentsList
                .stream()
                .mapToInt(Student::getAge)
                .sum();
        System.out.println(totalHeight);
    }

    public static void MaxAndMin(List<Student> studentsList) {
        int maxHeight = studentsList
                .stream()
                .mapToInt(Student::getAge)
                .max()
                .getAsInt();
        System.out.println("max:" + maxHeight);
        int minHeight = studentsList
                .stream()
                .mapToInt(Student::getAge)
                .min()
                .getAsInt();
        System.out.println("min:" + minHeight);
    }
}
