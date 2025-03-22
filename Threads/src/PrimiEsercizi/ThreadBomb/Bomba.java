public class Bomba extends Thread {
    private String in;

    /*
    Crea un thread che fa un countdown da 10 a 0.
    Se l'utente preme "ENTER" prima che il countdown finisca, stampa "Bomba disinnescata!".
    Se il countdown arriva a 0, stampa "💥 BOOM!".

     */
    public Bomba(String in) {
        this.in = in;
    }

    public void run() {
        boolean d = false;
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            if (in.equals("ENTER")) {
                d = true;
                System.out.println("Bomba disinnescata");
                break;
            }
        }
        if (!d) {
            System.out.println("\uD83D\uDCA5 BOOM");
        }
    }

}
