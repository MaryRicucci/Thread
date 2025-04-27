package CatenaV2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int startValue = 1;
        ArrayList<ContaThreadv2> catena = new ArrayList<>();
        ContaThreadv2 prevThread = null; // Variabile per mantenere il riferimento al precedente

        for (int i = 0; i < 10; i++) {
            int endValue = startValue + 9; // Stampiamo sempre 10 numeri
            ContaThreadv2 thread = new ContaThreadv2(startValue, endValue, prevThread);
            catena.add(thread);
            prevThread = thread;  // Aggiorna il riferimento
            startValue = endValue + 1;
        }

        for (ContaThreadv2 c : catena) {
            c.start();
        }
    }
}