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
      System.out.print ("Auto in gara: "+pilota+"-"+scuderia+" velocità attuale: "+speed+" Km/h");
    }
      try {
        System.out.print ("PIT STOP di "+pilota+"-"+scuderia);
        Thread.sleep (2000);
        speed = 10 ;  
    }
      catch (InterruptedException e) {
        System.out.print (e.getMessage());
      }
    }
  }}
