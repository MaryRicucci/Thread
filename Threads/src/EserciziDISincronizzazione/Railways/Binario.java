package EserciziDISincronizzazione.Railways;

public class Binario {
    private int n;
    private boolean occupato ;

    public boolean isOccupato() {
        return occupato;
    }

    public Binario (int n) {
        this.n = n;
        occupato = false ;
    }

    public void setOccupato (boolean t) {
        occupato = t ;
    }
}
