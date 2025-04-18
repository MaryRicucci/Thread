import java.util.Random ;
import java.util.ArrayList;

public class PrinterThread extends Thread{
    Random r = new Random();
    private Printer printer ;
    private ArrayList <Document> docs ;
    public PrinterThread (Printer p) {
        this.printer = p ;
        this.docs = generateDocs();
    }
    @Override
    public void run () {
            for (Document d: docs) {
                printer.Stampa(d);
            }
    }
    private ArrayList <Document> generateDocs () {
        ArrayList <Document> results = new ArrayList<>();
        int maxDocs =r.nextInt (2,4) ;
                for (int i = 0 ; i<maxDocs; i++) {
                    results.add(new Document("Title: " + (i+1), "Text: " + (i+1)));

                }
                return results;
    }
}
