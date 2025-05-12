package EserciziDISincronizzazione.Bouncer;
import java.util.Random ;
import java.util.concurrent.Semaphore;

public class Buttafuori {
    /*
    Buttafuori:
età minima
max persone
tot persone
Il buttafuori permette l'ingresso solo a clienti che hanno almeno 18 anni. 🔞
Se il cliente non rispetta questo parametro non dovrà entrare nel locale (si termini il thread)
Il numero massimo di clienti all'interno del club non deve superare una certa capacità massima.

Se un cliente rispetta i limiti d’età ma il locale è pieno dovrà aspettare.
I clienti che riescono ad entrare trascorrono un tempo casuale all'interno del club prima di uscire.
     */

    Random r;
    private final int MinAge = 18;


    private Semaphore sem ;
    public Buttafuori () {
        r = new Random ();
        sem = new Semaphore(3);
    }
    public synchronized void Entra (int age) {
        if (age<MinAge){
            System.out.println(Thread.currentThread().getName()+" ha "+age+" anni");
            return;
        }
        else {
            if (sem.availablePermits()>0){

                try {
                    sem.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    System.out.println(Thread.currentThread().getName()+" è entrato nel locale ("+sem.availablePermits()+")");
                    Thread.sleep(r.nextInt(100, 300));
                }catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName()+" interrotto");
                }
                sem.release();
                System.out.println(Thread.currentThread()+ "uscito dal locale ("+sem.availablePermits()+")");
            }
            else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName()+" interrotto");
                }
                notify();
            }
        }
    }
}
