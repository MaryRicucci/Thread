package CatenaMontaggio;

import java.util.concurrent.Semaphore;

public class Assemblaggio {
    private Semaphore s ;

    public Assemblaggio () {
        s = new Semaphore(2);
    }

    public void entra (Thread t) {
       try  {
           s.acquire();
           System.out.println(t.getName()+" sta eseguendo l'assemblaggio");
           try {
               Thread.sleep (500);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println(t.getName()+" ha terminato l'assemblaggio");
           s.release();
       } catch (InterruptedException e) {
           System.out.println(Thread.currentThread().getName()+" interrotto");
       }


    }
}
