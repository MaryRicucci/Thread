package EserciziDISincronizzazione.Bouncer;

import java.util.ArrayList;
import java.util.Random ;
public class Main {
    public static void main (String [] args) {
    Buttafuori b = new Buttafuori();
    Random r = new Random () ;
    ArrayList <ClienteThread> clienti = new ArrayList<>() ;

    for (int i = 1 ; i<31; i++) {
        clienti.add(new ClienteThread(r.nextInt(14,40),b,("Cliente"+i)));
    }
    for (ClienteThread c: clienti) {
        c.start();
    }
    for (ClienteThread c: clienti) {
        try {
            c.join();
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" interrotto");
        }
    }
        System.out.println("Discoteca chiusa");
    }
}
