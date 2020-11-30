package proxy.simpleaop;

import java.lang.String;

/**
 * Created by Edwin Xu on 4/29/2020 6:20 PM
 */
public class PersonImpl implements Person {
    private String name;
    public PersonImpl(String name){
        this.name =name;
    }
    @Override
    public void eat(){
        System.out.println(name+" is eating!");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
