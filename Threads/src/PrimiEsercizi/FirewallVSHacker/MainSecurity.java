package FirewallVSHacker;

public class MainSecurity {
    public static void main (String [] args) {

    /*
    Un thread "FirewallVSHacker.Hacker" cerca di forzare un accesso (stampa "Tentativo di accesso n...").
    Un altro thread "FirewallVSHacker.Firewall" stampa "Intruso bloccato!" ogni 3 tentativi dell'hacker.
    Dopo 10 tentativi, stampa "Accesso concesso!" e termina.

     */
    Firewall f = new Firewall() ;
    Hacker h = new Hacker() ;

    h.start () ;
    f.start();
} }
