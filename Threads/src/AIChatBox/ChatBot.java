package AIChatBox;
import java.util.Random ;
public class ChatBot extends Thread {
    private boolean Stop; 
    Random random = new Random();

    public ChatBot() {
        Stop = false;
    }

    public void fermaChat(String input) {
        if (input.equalsIgnoreCase("STOP")) {
            Stop = true;
        }
    }

    @Override
    public void run() {
        while (!Stop) {
            char randomChar = (char) (random.nextInt(26) + 'A');
            System.out.println("ChatBot dice: " + randomChar);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("ChatBot si sta spegnendo...");
    }
}
