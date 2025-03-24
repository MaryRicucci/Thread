public class Strumento extends Thread {
  private String suoni;
  private int pausa;
  private boolean vivo ;

  public Strumento (String suono, int pausa) {
    this.pausa = pausa ;
    this.suono = suono;
    vivo = true ;
  }
@Override
  public void run () {
    while (vivo) {
    System.out.print (suono);
    try {
    Thread.sleep (pausa) ;
    } catch (InterruptedException e) {
      System.out.print (e.getMessage()) ;
    }
  }
  }

  public void setVivo () {
    vivo = false ;
  }
      
