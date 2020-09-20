package reflection;
public class ReflectionClass{
    private String name;
    private void f(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Class c = ReflectionClass.class;
        System.out.println(c.getSimpleName());
        System.out.println(c.getName());
        System.out.println(c.getPackage());
        System.out.println();
    }
}