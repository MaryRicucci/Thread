package EserciziDISincronizzazione.Barriera;
import java.util.Random ;
public class BarrierThread extends Thread{
    /*
    Classe BarrierThread:
Questa classe ha il seguente comportamento:
Lavora per un tempo randomico tra i 2 e i 5 secondi (simulabile con Thread.sleep(randomVal))
raggiunge la barriera
Una volta svegliato stampa a schermo il suo nome seguito dalla stringa “ riprende a lavorare”.
     */
    private SynchBarrier barrier ;
    private Random r ;
    public BarrierThread (SynchBarrier b, String name) {
        barrier = b ;
        r = new Random () ;
        setName(name);
    }

    @Override
    public void run () {
        System.out.println(getName()+" sta lavorando...");
        try {
            Thread.sleep(r.nextInt(2000,5000));
        }catch (InterruptedException e) {
            System.out.println(getName()+" interrotto");
        }
        System.out.println(getName()+" fa la pausa");
        barrier.Barrier();
        System.out.println(getName()+" riprende a lavorare");
    }
}
