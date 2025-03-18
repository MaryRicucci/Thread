package Spiegazione;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EvenThread e = new EvenThread();
        OtherThread o = new OtherThread() ;

        o.start();
        e.start () ;

    }
}