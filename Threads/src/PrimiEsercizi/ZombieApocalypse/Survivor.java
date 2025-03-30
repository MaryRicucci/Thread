package ZombieApocalypse;

public class Survivor extends Thread {
    private boolean escaped;
    private String input;

    public Survivor() {
        this.escaped = false;
        this.input = null;
    }

    @Override
    public void run() {
        while (ApocalypseSimulator.isSurvivorAlive()) {
            if (escaped) {
                System.out.println("Il sopravvissuto è scappato! Gli zombie si fermano automaticamente.");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setInput(String input) {
        if ("escape".equalsIgnoreCase(input)) {
            this.escaped = true;
        }
    }
}
