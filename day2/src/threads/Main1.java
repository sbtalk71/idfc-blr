package threads;

public class Main1 {
    public static void main(String[] args)  throws InterruptedException{

        System.out.println(Thread.currentThread().getName()+" starts");
        MyThread t1= new MyThread();

        MyThread t2= new MyThread();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(Thread.currentThread().getName()+" Exits");
    }
}
