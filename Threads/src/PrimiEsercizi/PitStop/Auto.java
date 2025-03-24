Crea 3 thread che rappresentano auto da corsa. Ogni auto corre stampando "Velocità
attuale: X km/h"
. Ogni 5 iterazioni, deve fermarsi per un pit stop di 2 secondi prima di
ripartire.

  public class Auto extends Thread {
  private int speed ;
  private String pilota , scuderia ;

  public Auto (String pilota, String scuderia) {
    speed = 0 ;
    this.pilota = pilota ;
    this.scuderia = scuderia ;
  }

  @Override
  public void run () {
    while (true) {
    for (int i = 1 ; i<6 ; i++) {
      speed = speed + 30 ;
      System.out.print ("Auto in gara: "+pilota+"-"+scuderia);
    }
      
    }
