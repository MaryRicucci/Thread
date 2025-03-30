package ZombieApocalypse;

public class Zombie extends Thread {
    @Override
    public void run() {
        while (ApocalypseSimulator.isSurvivorAlive()) {
            System.out.println("Sto arrivando...");
            try {
                Thread.sleep(1000); // Aspetta 1 secondo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Zombie terminato.");
    }
}