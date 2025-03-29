package Bar;
import java.util.Random ;
public class Barman extends Thread {
    private int clienteServito = 0;

    public int getClienteServito() {
        return clienteServito;
    }

    @Override
    public void run() {
        while (clienteServito < 5) {
            clienteServito++;
            System.out.println("Cocktail preparato per il cliente: " + clienteServito);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}