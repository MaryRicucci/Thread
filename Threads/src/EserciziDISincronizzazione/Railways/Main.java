package EserciziDISincronizzazione.Railways;

import java.util.ArrayList;
import java.util.Random ;
public class Main {
    public static void main (String [] args) {
        /*
        Stazione ferroviaria 🚅 (HAARD!!)
Descrizione:
Scrivi un’applicazione concorrente Java che simula l’interazione tra una
-stazione ferroviaria composta da N binari e un
certo numero  T di treni.

Requisiti:
Classe Stazione:
La stazione è identificata da un
nome identificativo
deve gestire un certo numero di binari N.

Classe Treno:
-codice numerico identificativo
- stazione di destinazione
Il suo comportamento è il seguente:
Viaggia verso la stazione.
 Il tempo del viaggio è randomico nell’intervallo [2, 5] secondi.
Cerca di ottenere un binario libero
Se lo ottiene ci rimarrà per un tempo randomico nell’intervallo [2, 5] secondi
Se non ci sono binari liberi dovrà essere messo in attesa
Una volta ottenuto un binario libero e passato il periodo di attesa, il treno ripartirà liberando il binario assegnato
NOTE esercizio 5:
Si potrebbero simulare i binari con una classe apposita o con un vettore di boolean.
La seconda soluzione è più veloce, la prima è concettualmente più attinente ai principi OOP.

         */
        Random r = new Random ();
        ArrayList <TrenoThread> treni = new ArrayList<>() ;
        Stazione s = new Stazione ("Station ",r.nextInt(10,15));
        for (int i = 0; i<18;i++) {
            treni.add(new TrenoThread("TR"+(i+1),s));
        }
        for (TrenoThread t: treni) {
            t.start();
        }

        try {
            for (TrenoThread t : treni) {
                    t.join();

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(s.getNome()+" chiude");

    }
}
