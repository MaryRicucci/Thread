package FirewallVSHacker;

public class Firewall extends Thread{
    public Firewall () {

    }
    /*
    Un thread "FirewallVSHacker.Hacker" cerca di forzare un accesso (stampa "Tentativo di accesso n...").
    Un altro thread "FirewallVSHacker.Firewall" stampa "Intruso bloccato!" ogni 3 tentativi dell'hacker.
    Dopo 10 tentativi, stampa "Accesso concesso!" e termina.
     */
    @Override
    public void run () {
        while (Hacker.getTentativi()<11) {
            if ((Hacker.getTentativi() % 3 )==0){
                System.out.println("Intruso bloccato!");
            }
            try{
                Thread.sleep(300);
            }catch (InterruptedException e) {
                e.getMessage();
            }
        }

    }
}
