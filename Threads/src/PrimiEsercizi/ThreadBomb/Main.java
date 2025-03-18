package PrimiEsercizi.ThreadBomb;
import java.util.Random ;
public class Main {
    public static void main (String [] args) {
        Random random = new Random () ;
        /*
        Crea un thread che fa un countdown da 10 a 0.
        Se l'utente preme "ENTER" prima che il countdown finisca, stampa "Bomba disinnescata!".
        Se il countdown arriva a 0, stampa "💥 BOOM!".

         */

        for (int i = 0 ; i<20 ; i++) {
            String in = "";
            if (random.nextBoolean()){
                in = "ENTER";
            }
            Bomba b = new Bomba(in);
            b.start();
        }

    }
}
