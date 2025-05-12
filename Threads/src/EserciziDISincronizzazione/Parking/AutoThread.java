package EserciziDISincronizzazione.Parking;

import java.util.Random;

public class AutoThread extends Thread {
    private Parking p;
    private Random r = new Random();

    public AutoThread(Parking p, String name) {
        this.p = p;
        setName(name);
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " sta guidando...");
            Thread.sleep(r.nextInt(2000, 5000));
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrotto.");
        }

            p.Entra();  // L'auto tenta di entrare nel parcheggio dopo aver guidato


    }
}