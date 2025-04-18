import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Printer p = new Printer () ;
        List<Thread> threads = new ArrayList<>();

        for (int i = 1 ; i<10; i++) {
            threads.add(new PrinterThread(p));
        }

        for (Thread t: threads) {
            t.start();
            t.join() ;

        }
        long endTime = System.currentTimeMillis()-startTime;
        System.out.println("EXEC TIME: "+endTime+" ms");
        System.out.println("Documenti stampati: "+p.getDocsPrinted());

    }
}
