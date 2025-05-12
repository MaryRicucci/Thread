package EserciziDISincronizzazione.Barriera;

import java.util.ArrayList;

public class Main {
    public static void main (String [] args) throws InterruptedException {
        /*
        Barriera sincronizzata 🚧
Descrizione:
Simula una barriera sincronizzata che ferma tutti i thread in arrivo fino al raggiungimento di una soglia fissata,
per poi svegliarli tutti insieme.
Requisiti:

Classe BarrieraSincronizzata:
Questa classe deve tenere traccia di quanti thread sono in attesa sulla barriera e del valore massimo di thread gestibili
Fino a che il numero di thread in attesa sulla barriera è minore della soglia fissata bisognerà fermare i thread. ⬇️
Quando il numero di thread in attesa supera la soglia si dovranno svegliare tutti i thread in attesa sulla barriera.

Classe BarrierThread:
Questa classe ha il seguente comportamento:
Lavora per un tempo randomico tra i 2 e i 5 secondi (simulabile con Thread.sleep(randomVal))
raggiunge la barriera
Una volta svegliato stampa a schermo il suo nome seguito dalla stringa “ riprende a lavorare”.


         */
        SynchBarrier s = new SynchBarrier();
        ArrayList<BarrierThread> workers = new ArrayList <> ();

        for (int i = 0; i<5;i++) {
            workers.add(new BarrierThread(s,"Op"+(i+1)));
        }
        for (BarrierThread b: workers) {
            b.start ();
        }
        for (BarrierThread b: workers) {
            b.join();
        }
        System.out.println("Tutti a lavoro!");
    }
}
