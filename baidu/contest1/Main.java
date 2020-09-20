package baidu.contest1;

import java.util.Scanner;

/**
 * Created by Edwin Xu on 7/19/2020 1:59 PM
 */
public class Main {
    //60 2 3 5

    /*
    * GPA
    * */
    public double getGPA(int n){
        if (n<60)return 0;
        if (n<62)return 1;
        if (n<65)return 1.7;
        if (n<67)return 2.0;
        if (n<70)return 2.3;
        if (n<75)return 2.7;
        if (n<80)return 3.0;
        if (n<85)return 3.3;
        if (n<90)return 3.7;
        if (n<95)return 4.0;
        return 4.3;
    }

    public double getMaxGPA(int sum,int n){
        if (n==0)return 0;






        if (sum<60)return 0;
        int res = 0;

        double a = getMaxGPA(sum-95,n-1);


        return 0;
    }




    /*
    * Problem Description
初始有 a, ba,b 两个正整数，每次可以从中选一个大于 1 的数减 1，最后两个都会减到 1，我们想知道在过程中两个数互质的次数最多是多少。
    * */

    static boolean  isCoprime(int x,int y)
    {
        if (x==1 || y==1) return true;
        if (x%y==0)return false;
        else return isCoprime(y,x%y);
    }

    static int[][] arr = new int[1000][1000];
    public static int getMax(int a,int b){
        if (a==1 && b==1)return 1;

        boolean is =isCoprime(a,b);
        if (a>1 && b>1){
            if (arr[a-1][b]==0) arr[a-1][b]= getMax(a-1,b);
            if (arr[a][b-1]==0) arr[a][b-1]= getMax(a,b-1);
            int max = Math.max(arr[a-1][b],arr[a][b-1]);
            return is?1+max:max;
        }
        if (a==1 && b>1){
            if (arr[a][b-1]==0) arr[a][b-1]= getMax(a,b-1);
            return is?1+ arr[a][b-1]:arr[a][b-1];
        }
        if (b==1 && a>1){
            if (arr[a-1][b]==0) arr[a-1][b]= getMax(a-1,b);
            return is?1+arr[a-1][b]:arr[a-1][b];
        }
        return 0;
    }



    public static void getM(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(getMax(sc.nextInt(),sc.nextInt()));
        }
    }


    public static void main(String[] args) {
        Main.getM();
    }
}
