package concurrent.ProducerConsumerProblem;

/**
 * Created by Edwin Xu on 6/28/2020 10:46 PM
 */
public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();

        new Thread(new Producer(storage)).start();
        new Thread(new Producer(storage)).start();
        new Thread(new Producer(storage)).start();
        new Thread(new Consumer(storage)).start();
        new Thread(new Consumer(storage)).start();

    }
}
