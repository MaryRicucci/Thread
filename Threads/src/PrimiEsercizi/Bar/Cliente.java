package Bar;
class Cliente extends Thread {
    private final int n;
    private boolean servito;

    public Cliente(int n) {
        this.n = n;
        this.servito = false;
        start();
    }

    public int getN() {
        return n;
    }

    public boolean isServito() {
        return servito;
    }

    public void assegnaTurno() {
        servito = true;
    }

    @Override
    public void run() {
        while (!servito) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Cliente " + n + ": Grazie per il cocktail!");
    }
}