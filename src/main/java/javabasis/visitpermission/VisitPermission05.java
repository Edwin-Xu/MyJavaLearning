package javabasis.visitpermission;

import javabasis.visitpermission.b.VisitPermission04;

/**
 * @author Edwin Xu
 * @date 6/2/2021 11:19 PM.
 */

public class VisitPermission05 {
    public static void main(String[] args) {
        VisitPermission04 permission04 = new VisitPermission04();
//        System.out.println(permission04.privateField);
//        System.out.println(permission04.defaultField);
//        System.out.println(permission04.protectedField);
        System.out.println(permission04.publicField);
    }
}
