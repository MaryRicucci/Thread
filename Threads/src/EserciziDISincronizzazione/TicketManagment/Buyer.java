package EserciziDISincronizzazione.TicketManagment;

public class Buyer extends Thread{
    /*
    Classe Buyer
Questa classe simula un ipotetico compratore online che cerca, in concorrenza con altri compratori, di comprare un biglietto.
     */
    private TicketManager tm ;

    public Buyer(TicketManager tm, String name) {
        this.tm=tm ;
        setName(name);
    }

    @Override
    public void run () {
        tm.buyTicket();
    }
}
