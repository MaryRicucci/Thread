package EserciziDISincronizzazione.TicketManagment;

public class TicketManager {
    /*
    Classe TicketManager
Questa classe deve tenere traccia del numero totale di biglietti acquistabili e permettere ai compratori di acquistare un biglietto.
La procedura di acquisto può terminare positivamente se c’è almeno un biglietto da vendere o negativamente
se i biglietti si sono esauriti.
     */

    private int AVAILABLE_TICKETS ;

    public TicketManager () {
         AVAILABLE_TICKETS = 10;
    }

    public synchronized void buyTicket() {
        if (AVAILABLE_TICKETS>0){
            AVAILABLE_TICKETS--;
            System.out.println(Thread.currentThread().getName()+" ha comprato un biglietto! Biglietti rimasti: "+AVAILABLE_TICKETS);

        }
        else {
            System.out.println(Thread.currentThread().getName()+" non è riuscito a comprare il biglietto!");
            Thread.currentThread().interrupt();
        }
    }
}
