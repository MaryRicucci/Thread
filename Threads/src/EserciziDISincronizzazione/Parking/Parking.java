package EserciziDISincronizzazione.Parking;

import java.util.Random;


import java.util.Random;
import java.util.concurrent.Semaphore;

public class Parking {
    private Random r = new Random();

    private Semaphore sem ;
    public Parking() {
     sem = new Semaphore (5);
    }



    public  void Entra() {
        while (sem.availablePermits() == 0) {  // Usa "while" per evitare race conditions
            System.out.println(Thread.currentThread().getName() + " attende posto.");
        }

        try {
            sem.acquire();

        System.out.println(Thread.currentThread().getName() + " è nel parcheggio (" + sem.availablePermits() + ")");

        try {
            Thread.sleep(r.nextInt(3000, 8000));  // Simula il tempo di parcheggio
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrotto.");
        }

        sem.release();
        System.out.println(Thread.currentThread().getName() + " esce dal parcheggio.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}