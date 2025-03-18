package PrimiEsercizi.GaraThread;
import java.util.Random ;
public class Corridore extends Thread {
    Random random = new Random () ;
    public Corridore (int n) {
        setName("Corridore: "+n);
    }

    @Override
    public void run () {
        for (int i = 0 ; i<3 ;i++){
            System.out.println(getName()+" sto correndo...");
            try {
                Thread.sleep (random.nextInt(500-100)+100);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" interrotto");
            }
        }
        System.out.println(getName()+" taglio il traguardo!");
    }
}
