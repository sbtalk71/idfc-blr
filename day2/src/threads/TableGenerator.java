package threads;

public class TableGenerator {

    public synchronized void generateTable(int num){
        try{
            for(int i=1;i<=10;i++) {
                System.out.println(num+" x "+i+" = "+(num*i));
                Thread.sleep(1500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
