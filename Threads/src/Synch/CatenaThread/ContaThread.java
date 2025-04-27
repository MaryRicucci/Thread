package CatenaThread;

public class ContaThread extends Thread {
    private int start, end;
    private final Object syncObject;

    public ContaThread(int start, int end, Object syncObject) {
        this.start = start;
        this.end = end;
        this.syncObject = syncObject;
    }

    @Override
    public void run() {
        synchronized (syncObject) {
            try {
                for (int i = start; i <= end; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();

                syncObject.notifyAll();  // Avvisa il prossimo thread
                syncObject.wait();       // Aspetta che il prossimo thread finisca
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrotto.");
            }
        }
    }
}