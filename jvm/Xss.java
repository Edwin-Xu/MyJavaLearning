package jvm;

/**
 * Created by Edwin Xu on 9/28/2020 8:26 PM
 */
public class Xss {
    private static void recur(int n){
        if (n<=0)return;
        recur(n-1);
    }
    public static void main(String[] args) {
        recur(5000);
    }
}
