package RussianRoulette;
import java.util.Random ;

public class RussianRoulette {
    public static void main (String [] args) {
        Random random = new Random () ;
        Giocatore g1 = new Giocatore(1);
        Giocatore g2 = new Giocatore(2);
        Giocatore g3 = new Giocatore (3);
        Giocatore g4 = new Giocatore (4);
        Giocatore g5 = new Giocatore (5);
        Giocatore g6 = new Giocatore (6) ;
        int e  = 0 ;

            e = random.nextInt(6)+1;
            System.out.println("Numero estratto: "+e);

            switch (e) {
                case 1 :
                    g1.Colpito();
                    break ;
                case 2:
                    g2.Colpito();
                    break ;
                case 3:
                    g3.Colpito();
                    break ;
                case 4:
                    g4.Colpito();
                    break ;
                case 5:
                    g5.Colpito();
                    break ;
                default:
                    g6.Colpito();
                    break;
            }

            g1.start();
            g2.start();
            g3.start();
            g4.start();
            g5.start();
            g6.start();

        }
    }

