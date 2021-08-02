package javabasis.visitpermission.a;

/**
 * @author Edwin Xu
 * @date 6/2/2021 11:05 PM.
 *
 * 本包：仅不能访问private
 */
public class VisitPermission02 {
    public static void main(String[] args) {
        VisitPermission01 permission01 = new VisitPermission01();
//        System.out.println(permission01.privateField);
        System.out.println(permission01.defaultField);
        System.out.println(permission01.protectedField);
        System.out.println(permission01.publicField);
    }
}
