package Parcheggio;

public class AutoThread extends Thread{
    private Parcheggio p ;
    public AutoThread (Parcheggio p, String nome) {
        this.p = p ;
        setName(nome);
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            p.Parcheggia(AutoThread.currentThread());
            }

    }
}
