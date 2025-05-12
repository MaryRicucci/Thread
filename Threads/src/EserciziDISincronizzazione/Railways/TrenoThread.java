package EserciziDISincronizzazione.Railways;
import java.util.Random;
public class TrenoThread extends Thread{

    private String id ;
    private Stazione s ;
    private Random r ;
    public TrenoThread (String id , Stazione s) {
        setName(id);
        this.s=s;
        r= new Random () ;
    }

    @Override
    public void run () {
        System.out.println(getName()+" sta viaggiando...");
        try {
            Thread.sleep (r.nextInt(2000,5000));
        } catch (InterruptedException e) {
            System.out.println(getName()+" interrotto");
        }
        s.ciuf();
    }
}
