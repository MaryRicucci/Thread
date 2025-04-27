package CatenaV2;

public class ContaThreadv2 extends Thread {
    private int start, end;
    private final ContaThreadv2 prevThread; // Riferimento al thread precedente

    public ContaThreadv2(int start, int end, ContaThreadv2 prevThread) {
        this.start = start;
        this.end = end;
        this.prevThread = prevThread;
    }

    @Override
    public void run() {
        try {
            if (prevThread != null) {
                prevThread.join();  // Aspetta il completamento del thread precedente
            }

            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrotto.");
        }
    }
}