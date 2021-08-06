package javabasis.visitpermission.b;

import javabasis.visitpermission.a.VisitPermission01;

/**
 * @author Edwin Xu
 * @date 6/2/2021 11:10 PM.
 *
 * 其他包，非子类:  仅public能访问
 */
public class VisitPermission03 {
    public static void main(String[] args) {
        VisitPermission01 permission01 = new VisitPermission01();
//        System.out.println(permission01.privateField);
//        System.out.println(permission01.defaultField);
//        System.out.println(permission01.protectedField);
        System.out.println(permission01.publicField);
    }
}
