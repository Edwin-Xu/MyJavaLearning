package concurrent.ProducerConsumerProblem;

/**
 * Created by Edwin Xu on 6/28/2020 11:02 PM
 */
public class Producer implements Runnable {
    private Storage storage;
    public Producer(Storage s){
        storage=s;
    }
    @Override
    public void run() {
        while (true){
            try {
                storage.produce();
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
