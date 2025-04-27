package CatenaThread;
import java.util.Random ;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int startValue = 1;
        ArrayList<ContaThread> catena = new ArrayList<>();
        Object syncObject = new Object();

        for (int i = 0; i < 10; i++) {
            int endValue = startValue + r.nextInt(6, 20);
            catena.add(new ContaThread(startValue, endValue, syncObject));
            startValue = endValue + 1;
        }

        for (ContaThread c : catena) {
            c.start();
        }

        // Avvia la sincronizzazione
        synchronized (syncObject) {
            syncObject.notifyAll();
        }
    }
}