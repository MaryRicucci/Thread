package MatrixEffect;
import java.util.Random ;
public class Matrix extends Thread{
    /*
    The Matrix Effect
Crea un thread che stampa lettere casuali in stile "Matrix" per 10 secondi, cambiando riga ogni mezzo secondo.
Per effetto matrix si intende la stampa di un carattere a caso, andando a capo dopo ogni stampa

     */
    Random random = new Random () ;
    public Matrix () {

    }
    @Override
    public void run () {
        int c  ;
        for (int i = 1 ; i<11; i++) {
            c = random.nextInt (26) ;
            System.out.println ((char) (c + 'A'));
            try {
                Thread.sleep(500); // Pausa di mezzo secondo
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
