package baidu.contest3;

import java.lang.String;
import java.util.Scanner;

/**
 * Created by Edwin Xu on 7/26/2020 2:13 PM
 */
public class Main1 {
    public static double f(int [] b, double[] c){
        double min = -1;
        for(int i=0;i<b.length;i++){
//            System.out.println(1-c[i]+"/"+"("+b[i]+" +"+(1-c[i])+")="+(1-c[i])/(1-c[i]+b[i]));
            double tmp = (1-c[i])/(1-c[i]+b[i]);
            if(min<tmp ) min = tmp;
        }
        return min;
    }

    public static void main(String[] args) {
//        DecimalFormat df = new DecimalFormat();
//        df.applyPattern("###.#####");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            int count = sc.nextInt();
            int b[] = new int[count];
            double c[] = new double[count];
            for (int j=0;j<count;j++){
                b[j] = sc.nextInt();
                c[j] = sc.nextDouble();

            }
            System.out.println(String.format("%.5f",  Main1.f(b,c)));
        }
    }
}
