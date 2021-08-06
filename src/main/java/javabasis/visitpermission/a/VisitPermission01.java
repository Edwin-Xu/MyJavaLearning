package javabasis.visitpermission.a;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Edwin Xu
 * @date 6/2/2021 9:54 PM.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VisitPermission01 {
    private    int privateField;
               int defaultField;
    protected  int protectedField;
    public     int publicField;

    // 本类，所有都可以访问
    public static void main(String[] args) {
        VisitPermission01 visitPermission01 = new VisitPermission01();
        System.out.println(visitPermission01.privateField);
        System.out.println(visitPermission01.defaultField);
        System.out.println(visitPermission01.protectedField);
        System.out.println(visitPermission01.publicField);
    }
}
