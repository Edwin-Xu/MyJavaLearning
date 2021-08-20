package javabasis.serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * @author taoxu.xu
 * @date 8/6/2021 11:20 AM
 */
public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "D:\\EdwinXu\\ProgrammingWorkspace\\java-learning\\MyJavaLearning\\src\\main\\resources\\SerializableTest.out";
        final ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));

        final Cat cat = new Cat("edw");
        outputStream.writeObject(cat);

        final ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
        final Cat cat1 = (Cat)inputStream.readObject();
        System.out.println(cat1);

        System.out.println("---------");
        final Dog dog = new Dog("edw");
        outputStream.writeObject(dog);

        final Dog dog1 = (Dog)inputStream.readObject();
        System.out.println(dog1);


    }
}

@NoArgsConstructor
@AllArgsConstructor
class Cat implements Externalizable {
    private String name;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("writeExternal");
        out.writeObject(this);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("readExternal");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

@NoArgsConstructor
@AllArgsConstructor
class Dog implements Serializable{
    private String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}