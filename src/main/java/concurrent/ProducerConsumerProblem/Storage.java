package concurrent.ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Edwin Xu on 6/28/2020 10:50 PM
 */
public class Storage {
    private Integer nums = 0;
    private int MAX_CAP = 10;

    public void produce (){
        synchronized (nums){
            if (nums==MAX_CAP) System.out.println("仓库已满！不能生产！");
            else{
                nums++;
                System.out.println("生产1件，现有 "+nums+" 件");
            }

        }
    }
    public void consume(){
        synchronized (nums){
            if (nums==0) System.out.println("仓库为空，不能消费！");
            else{
                nums--;
                System.out.println("消费1件，现有 "+nums+" 件");
            }

        }
    }
}
