//Le risorse condivise non sono thread
public class Printer {
    Random r = new Random () ;

    private Semaphore semaphore ;
    private int docsQuenue, docsPrinted ;
    public Printer () {
        this.semaphore = new Semaphore (1);

    }

    public void Stampa (Document d) {
        System.out.println(Thread.currentThread().getName()+" cerca di stampare...");
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+" inizia la stampa");
            Thread.sleep (r.nextInt(500,1500));
            docsPrinted++;
            System.out.println(Thread.currentThread().getName()+" finisce la stampa");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrotto");
        }
        semaphore.release();
    }

    public int getDocsPrinted () {
        return docsPrinted;
    }
}
