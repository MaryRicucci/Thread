package Bar;

public class BarSimulation {
    public static void main(String[] args) {
        Barman b = new Barman();

        Cliente[] clienti = new Cliente[5];


        for (int i = 0; i < clienti.length; i++) {
            clienti[i] = new Cliente(i + 1);
        }

        b.start();


        while (b.isAlive()) {
            for (Cliente c : clienti) {
                if (c.getN() == b.getClienteServito() && !c.isServito()) {
                    c.assegnaTurno();
                }
            }
        }
    }
}