package CatenaMontaggio;

import java.util.concurrent.Semaphore;

public class Collaudo {
    private Semaphore s ;

    public Collaudo () {
        s = new Semaphore(1);
    }

    public void entra (Thread t) {
        try {
            s.acquire();
            System.out.println(t.getName()+" sta eseguendo il collaudo");
            Thread.sleep(400);
            System.out.println(t.getName()+" ha finito il collaudo");
            s.release();
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" interrottto");
        }

    }
}
