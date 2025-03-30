package AIChatBox;
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        ChatBot b = new ChatBot();
        Scanner sc = new Scanner(System.in);
        b.start();

        while (true) {
            System.out.println("Inserisci qualcosa: \nDigita STOP per terminare la chat");
            String userInput = sc.nextLine();
            b.fermaChat(userInput);


            if (userInput.equalsIgnoreCase("STOP")) {
                System.out.println("ChatBot si è fermato. Fine della conversazione.");
                break; // Esce dal loop e termina il programma
            }
        }
    }
}
