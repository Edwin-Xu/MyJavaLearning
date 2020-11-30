package baidu.contest3;

import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sc.nextInt(); i++) {
            double d = sc.nextDouble();
            if (d>=1) System.out.println("Yes");
            else{
                System.out.println("No");
            }
        }
    }
}
