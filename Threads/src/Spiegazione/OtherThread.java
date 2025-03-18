package Spiegazione;

public class OtherThread extends Thread {
    int n = - 1 ;
    public OtherThread () {
        setName ("Other Thread");
    }

    @Override
    public void run () {
        while (true) {
            n+=2 ;
            System.out.println(n);
            try {
                Thread.sleep (100) ;
                } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" interrotto");
            }
        }
    }
}
