package EserciziDISincronizzazione.TicketManagment;

import java.util.ArrayList;

public class Main {
    public static void main (String [] args) throws InterruptedException {
        /*
        Gestione dei Biglietti Online 🎟️
Descrizione:
Simulare la gestione dei biglietti per eventi online.
Ci sono più acquirenti che cercano di acquistare biglietti per un evento simultaneamente.
L'obiettivo è garantire che i biglietti non vengano venduti più del numero disponibile.
Requisiti:
Classe TicketManager
Questa classe deve tenere traccia del numero totale di biglietti acquistabili e permettere ai compratori di acquistare un biglietto.
La procedura di acquisto può terminare positivamente se c’è almeno un biglietto da vendere o negativamente
se i biglietti si sono esauriti.

Classe Buyer
Questa classe simula un ipotetico compratore online che cerca, in concorrenza con altri compratori, di comprare un biglietto.
Si testi il sistema con 10 biglietti disponibili e 20 compratori.

         */

        ArrayList<Buyer> buyers = new ArrayList<>();
        TicketManager tm = new TicketManager();

        for (int i = 1; i < 21; i++) {
            buyers.add(new Buyer(tm, "B" + i));
        }
        for (int i = 0; i < 20; i++) {
            buyers.get(i).start();
        }
        for (int i = 0; i < 20; i++) {
            buyers.get(i).join();
        }
        System.out.println("Fine vendita biglietti");
    }

}
