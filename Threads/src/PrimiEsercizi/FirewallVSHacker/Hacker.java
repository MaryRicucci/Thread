package FirewallVSHacker;

public class Hacker extends Thread {
    /*
    Un thread "FirewallVSHacker.Hacker" cerca di forzare un accesso (stampa "Tentativo di accesso n...").
    Un altro thread "FirewallVSHacker.Firewall" stampa "Intruso bloccato!" ogni 3 tentativi dell'hacker.
    Dopo 10 tentativi, stampa "Accesso concesso!" e termina.
     */
    private static int tentativi ;
    public Hacker () {
        tentativi = 0;
    }

    public static int getTentativi() {
        return tentativi;
    }

    @Override
    public void run () {
        while (tentativi<11) {
            tentativi++;
            System.out.println("Tentativo di accesso n: " + tentativi);
            try {
                Thread.sleep (500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Accesso consentito!");
    }


}


