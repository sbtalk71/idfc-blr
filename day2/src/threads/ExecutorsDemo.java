package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {

    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(2);

        TableGenerator tg = new TableGenerator();
        TableWorker w1= new TableWorker(tg,2);
        TableWorker w2= new TableWorker(tg,4);
        TableWorker w3= new TableWorker(tg,6);

        es.submit(w1);
        es.submit(w2);
        es.submit(w3);


        es.shutdown();
    }
}
