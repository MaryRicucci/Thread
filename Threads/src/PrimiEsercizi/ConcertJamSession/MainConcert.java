public class MainConcert {
  public static void main (String [] args) {

    Strumento chitarra = new Strumento ("🎸 Strum...", 400) ;
    Strumento batteria = new Strumento ("🥁 Boom...", 600) ;
    Strumenti cantante = new Strumento ("🎤 Yeahhh!", 1000);

    chitarra.start () ;
    batteria.start () ;
    cantante.start () ;

    try {
      Thread.sleep (10000) ; 
    } catch (InterruptedException e) {
      System.out.print (e.getNessage();
    }
    chitarra.setVivo () ;
    batteria.setVivo () ;
    cantante.setVivo () ;

    System.out.print ("Fine concerto") ;

  }}
                                        
