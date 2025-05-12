package EserciziDISincronizzazione.Parking;

import java.util.ArrayList;

public class MainParking {
    public static void main(String[] args) {
        ArrayList<AutoThread> auto = new ArrayList<>();
        Parking p = new Parking();

        for (int i = 1; i <= 10; i++) {
            AutoThread a = new AutoThread(p, "Car" + i);
            auto.add(a);
            a.start();
        }

        // Ora aspettiamo che tutte le auto finiscano
        for (AutoThread a : auto) {
            try {
                a.join();
            } catch (InterruptedException e) {
                System.out.println(a.getName() + " interrotto.");
            }
        }

        System.out.println("Parcheggio chiuso.");
    }
}
