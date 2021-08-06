package generic;

import java.lang.String;

/**
 * Created by Edwin Xu on 6/29/2020 1:48 PM
 */
class Father{

}
class Son{

}
class Son2 extends Father{

}
public class SuperExtends<T extends Father> {
    private T member;

    public T getMember() {
        return member;
    }

    public void setMember(T member) {
        this.member = member;
    }

    public static void main(String[] args) {
       SuperExtends<Father> superExtends = new SuperExtends<>();
       SuperExtends<Son2> superExtends2 = new SuperExtends<>();

       SuperExtends<? extends Father> superExtends1 = new SuperExtends<>();
       Father f =  superExtends1.getMember();
//       superExtends1.setMember(new Son2()); 不能set不知道具体是那种类型



    }
}
