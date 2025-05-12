package EserciziDISincronizzazione.Barriera;

public class SynchBarrier {
    /*
    Classe BarrieraSincronizzata:
Questa classe deve tenere traccia di quanti thread sono in attesa sulla barriera e del valore massimo di thread gestibili
Fino a che il numero di thread in attesa sulla barriera è minore della soglia fissata bisognerà fermare i thread. ⬇️
Quando il numero di thread in attesa supera la soglia si dovranno svegliare tutti i thread in attesa sulla barriera.
     */
    private int twait ;
    private  int max_threads ;
    public SynchBarrier () {
        twait=0;
        max_threads=5;
    }

    public synchronized void Barrier () {
        twait++;
        while (twait<max_threads) {
            try {
               wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" interrotto");
            }
        }
        notifyAll();
    }

}
