package reflection.createInstance_4methods;

import java.lang.String;

/**
 * Created by Edwin Xu on 4/28/2020 4:31 PM
 */
public class Clone implements Cloneable{
    private String name;
    public Clone(String name){
        this.name = name;
    }
    public void printName(){
        System.out.println("My name is "+ name);
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Clone c = new Clone("Edwin Xu");
            c.setName("Edwin Wang");
            Clone clone = (Clone) c.clone();
            clone.printName(); //My name is Edwin Wang
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
