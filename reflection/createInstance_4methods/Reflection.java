package reflection.createInstance_4methods;
import java.lang.reflect.Constructor;
import java.lang.String;

public class Reflection {
    public Reflection(){
        System.out.println("initializing");
    }
    public static void main(String[] args) {
        try {
            //方式1：Class.forName(full path)
            Reflection r = (Reflection) Class.forName("reflection.createInstance_4methods.Reflection").newInstance();
            //方式2：ClassName.class
            Reflection c1 = Reflection.class.newInstance();
            //方式3：利用Constructor
            Constructor<Reflection> con = Reflection.class.getConstructor();
            Reflection r2 = con.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
