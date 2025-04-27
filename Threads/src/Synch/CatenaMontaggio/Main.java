package CatenaMontaggio;
import java.util.Random ;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        /*
        Catena di montaggio
Una catena di montaggio ha due fasi:

Scrivi un programma concorrente dove ogni Operaio:
Prova ad accedere alla fase di assemblaggio
Successivamente, prova ad accedere al collaudo
Stampa messaggi coerenti in ogni fase
Testare il sistema con un numero di Operai > 2 ed assicurarsi che i messaggi siano corretti circa le specifiche
         */
        ArrayList<OperaioThread> operai = new ArrayList<>();
        Collaudo c = new Collaudo();
        Assemblaggio a = new Assemblaggio();
        int n = random.nextInt(3, 10);
        for (int i = 0; i < n; i++) {
            operai.add(new OperaioThread("Op" + (i + 1), c, a));
        }
        for (OperaioThread o : operai) {
            o.start();
        }
        for (OperaioThread o : operai) {
            o.interrupt();
        }


        for (OperaioThread o : operai) {
            try {
                o.join();
            } catch (InterruptedException e) {
                System.out.println("Main interrotto durante l'attesa.");
            }
        }

        System.out.println("Fine catena di montaggio.");
    }
}
