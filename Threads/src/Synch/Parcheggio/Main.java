package Parcheggio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Parcheggio p = new Parcheggio();
        ArrayList<AutoThread> auto = new ArrayList<>();

        // Creazione e avvio di tutti i thread
        for (int i = 1; i <= 10; i++) {
            auto.add(new AutoThread(p, "Auto " + i));
        }

        for (AutoThread a : auto) {
            a.start();
        }

        // Aspettiamo 2 secondi e interrompiamo i thread
        Thread.sleep(2000);
        for (AutoThread a : auto) {
            a.interrupt(); // Segnala ai thread che devono fermarsi
        }

        // Attesa della terminazione di tutti i thread
        for (AutoThread a : auto) {
            a.join(); // Attende la chiusura di ogni thread
        }

        System.out.println("Il parcheggio ha chiuso.");
    }
}