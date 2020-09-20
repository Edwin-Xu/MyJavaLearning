package baidu.contest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Edwin Xu on 7/25/2020 1:55 PM
 *
 * Problem Description
 * 小沃沃在玩一个有趣的游戏。
 *
 * 初始他有 nn 块钱，每一轮他需要投入至少 mm 块钱，系统会拿走其中 p%p% 的钱，并把剩下的钱还给他。
 *
 * 请问在最优情况下，小沃沃最多可以玩多少轮？
 *
 * 假设当前一轮小沃沃投入了 xx 块钱，那么他可以收回 \lfloor x \times (1-p%) \rfloor⌊x×(1−p%)⌋ 块钱，其中 \lfloor a \rfloor⌊a⌋ 表示 aa 取下整。 小沃沃每一轮投入的钱不能超过他现在拥有的钱。
 *
 * 每一轮投入的钱必须为整数。
 *
 * Input
 * 第一行一个正整数 test(1 \leq test \leq 100000)test(1≤test≤100000) 表示数据组数。
 *
 * 对于每组数据，一行三个整数 n, m, p(1 \leq n \leq 100000, 1 \leq m \leq 1000, 1 \leq p \leq 100)n,m,p(1≤n≤100000,1≤m≤1000,1≤p≤100)。
 *
 */


/*
*
*
* 这里是读取的问题吗，不对，之前有WA
*
*
*
* */
public class Main {
    static HashMap<Integer,Integer> map  = new HashMap<>();
    private static int singleInvest(int n,int m,double p){
        if (n<m)return 0;
        int max = Integer.MIN_VALUE;

        for (int i = m; i <=n ; i++) {
            int temp = n-i+(int)Math.floor(i*(1-p));
            if (!map.containsKey(temp) || map.get(temp)==0){
                map.put(temp,singleInvest(temp,m,p));
            }
            if (map.get(temp)>max)max = map.get(temp);
        }

//        int res = 0;
//        while (n>=m){
//            res++;
//            int a = n-m + (int)(m*(1-p));
//            int b = n-m-1 + (int)((m+1)*(1-p)); //多投1块如果能多回收一块， 感觉没用
//            n = Math.max(a,b);
//
//        }

        return max+1;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        try {

            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

            int test = Integer.valueOf( sc.readLine());
            for (int i = 0; i <test ; i++) {
                String a[] =  sc.readLine().split(" ");
                int n = Integer.valueOf(a[0]);
                int m = Integer.valueOf(a[1]);
                double p = Integer.valueOf(a[2])/100.0;
                System.out.println(Main.singleInvest(n,m,p));
                Main.map.clear();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}


/*
*
2
10 2 50
10 2 100


* */