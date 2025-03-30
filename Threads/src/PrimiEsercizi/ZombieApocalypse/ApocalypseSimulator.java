package ZombieApocalypse;

import java.util.Random;

public class ApocalypseSimulator {
    private static volatile boolean survivorAlive = true;

    public static void main(String[] args) {
        Survivor survivor = new Survivor();
        Zombie z1 = new Zombie();
        Zombie z2 = new Zombie();
        Zombie z3 = new Zombie();
        Zombie z4 = new Zombie();
        Zombie z5 = new Zombie();


        z1.start();
        z2.start();
        z3.start();
        z4.start();
        z5.start();


        survivor.start();

        Random random = new Random();
        long startTime = System.currentTimeMillis();

        while (survivorAlive) {

            boolean decision = random.nextBoolean();

            if (decision) {
                survivor.setInput("escape");
                System.out.println("Il sopravvissuto ha scelto di scappare!");
                survivorAlive = false;
                break;
            } else {
                System.out.println("Niente per adesso... gli zombie si avvicinano!");
            }


            if (System.currentTimeMillis() - startTime > 10000) {
                System.out.println("Sei stato morso!");
                survivorAlive = false;
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Fine della simulazione.");
    }

    public static boolean isSurvivorAlive() {
        return survivorAlive;
    }