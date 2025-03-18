package Spiegazione;

public class EvenThread extends Thread{
    int n = 0 ;
    public EvenThread () {
        setName ("Even Thread");
    }

    @Override
    public  void run ()  {
        while (true) {
            n+=2;
            System.out.println(n);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" interrotto");
            }
        }
    }
}
