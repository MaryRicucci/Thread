package CatenaMontaggio;

public class OperaioThread extends Thread {
    /*
    gni Operaio:
Prova ad accedere alla fase di assemblaggio
Successivamente, prova ad accedere al collaudo
Stampa messaggi coerenti in ogni fase
     */
    private Collaudo c ;
    private Assemblaggio a ;

    public OperaioThread (String n,Collaudo c , Assemblaggio a) {
        this.c = c ;
        this.a = a ;
        setName(n);
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                System.out.println(getName() + " tenta di entrare nell'assemblaggio...");
                a.entra(Thread.currentThread());

                System.out.println(getName() + " tenta di entrare nel collaudo...");
                c.entra(Thread.currentThread());

            } catch (Exception e) {
                System.out.println(getName() + " è stato interrotto.");
                return;
            }
        }
    }
}
