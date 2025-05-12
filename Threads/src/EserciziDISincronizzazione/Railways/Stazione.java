package EserciziDISincronizzazione.Railways;
import java.sql.SQLOutput;
import java.util.Random ;
import java.util.ArrayList;
import java.util.concurrent.Semaphore ;
public class Stazione {
    /*
    Requisiti:
Classe Stazione:
La stazione è identificata da un
nome identificativo
deve gestire un certo numero di binari N.
Cerca di ottenere un binario libero
Se lo ottiene ci rimarrà per un tempo randomico nell’intervallo [2, 5] secondi
Se non ci sono binari liberi dovrà essere messo in attesa
Una volta ottenuto un binario libero e passato il periodo di attesa, il treno ripartirà liberando il binario assegnato
     */
    private String nome ;
    Random r = new Random ();
    private ArrayList<Binario> binari ;
    private Semaphore s ;

    public Stazione (String nome, int b) {
        this.nome = nome;
        s = new Semaphore((r.nextInt(3,b)));
        for (int i = 1;i<=b;i++) {
            binari.add(new Binario(i));
        }
    }


    public String getNome() {
        return nome;
    }

    public void ciuf () {
        int bin = -1;
        try {
            if (s.availablePermits()<=0) {
                wait();
            }
            notify();
            s.acquire();
            while ((bin<0) && (binari.get(bin).isOccupato())){
                bin = r.nextInt(0,((binari.size()-1)));
            }
            binari.get(bin).setOccupato(true);
            System.out.println(Thread.currentThread().getName()+" è nel binario ");
            Thread.sleep(r.nextInt(2000,5000));
            System.out.println(Thread.currentThread().getName()+" è partito e ha lasciato il binario "+binari.get(bin));
            binari.get(bin).setOccupato(false);
            s.release();
            bin = -1 ;
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" interrotto");
        }
    }
}
