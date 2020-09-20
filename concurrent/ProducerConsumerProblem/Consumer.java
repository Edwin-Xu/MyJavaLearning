package concurrent.ProducerConsumerProblem;

/**
 * Created by Edwin Xu on 6/28/2020 11:02 PM
 */
public class Consumer implements Runnable {
    private Storage storage;
    public Consumer(Storage s){
        storage=s;
    }
    @Override
    public void run() {
        while (true){
            try {
                storage.consume();
                Thread.sleep(1500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
