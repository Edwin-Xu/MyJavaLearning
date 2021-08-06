package javabasis.visitpermission.b;

import javabasis.visitpermission.a.VisitPermission01;

/**
 * @author Edwin Xu
 * @date 6/2/2021 11:11 PM.
 *
 * 其他包子类：继承了所有Field(注意不是只继承了public、protected, 这只是访问权限，和继承与否吴无关),
 * 能访问public、protected
 * 其他包的类Son，访问不到这个Father本身的protectedField，因为protectedField是不能被外包访问的，
 * 子类Son的protectedField是可以被同包的类访问的，不同包的同样不可用访问。
 */
public class VisitPermission04 extends VisitPermission01 {
    public static void main(String[] args) {
        // 这是子类，本包下可以访问的protectedField
        VisitPermission04 permission04 = new VisitPermission04();
//        System.out.println(permission04.privateField);
//        System.out.println(permission04.defaultField);
        System.out.println(permission04.protectedField);
        System.out.println(permission04.publicField);

        // 这是其他包的非子类，访问不了protectedField
        VisitPermission01 permission01 = new VisitPermission01();
//        System.out.println(permission01.privateField);
//        System.out.println(permission01.defaultField);
//        System.out.println(permission01.protectedField);
        System.out.println(permission01.publicField);
    }
}
