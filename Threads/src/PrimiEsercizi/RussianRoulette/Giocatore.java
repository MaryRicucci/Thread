package RussianRoulette;

public class Giocatore extends Thread {
    /*
    Roulette Russa con Thread 🔫
Crea 6 thread che rappresentano giocatori di una roulette russa.
Uno solo di loro stampa "BANG! Sono fuori!" mentre gli altri stampano "Sono salvo!".
Il "colpo" viene assegnato casualmente.

     */
    private int Number ;
    private boolean colpito ;
    public Giocatore (int Number) {
        this.Number = Number ;
        colpito = false ;
    }

    @Override
    public void run () {
        if (colpito){
            System.out.println("Giocatore: "+Number+" -- BANG! Sono fuori!");
        }
        else {
            System.out.println("Giocatore: "+Number+"--Sono salvo!");
        }

    }

    public void Colpito () {
        this.colpito = true ;
    }

    public void reset () {
        this.colpito = false ;
    }
}
