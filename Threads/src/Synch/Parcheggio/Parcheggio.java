package Parcheggio;

import java.util.concurrent.Semaphore;

public class Parcheggio {
    private Semaphore sem ;
    public Parcheggio () {
          sem =  new Semaphore(3);
    }

    public void Parcheggia (Thread a) {
        System.out.println (a.getName()+" tenta di parcheggiare");
        try {
            sem.acquire();
            System.out.println(a.getName()+" ha parcheggiato");
            System.out.println("Posti disponibili: "+sem.availablePermits());
            Thread.sleep(100);
            System.out.println(a.getName()+" sta lasciando il parcheggio");
            System.out.println("Posti disponibili: "+sem.availablePermits());
            sem.release();
        } catch (InterruptedException e) {
            System.out.println(a.getName() + " interrotto");
            Thread.currentThread().interrupt();
        }
    }
}
