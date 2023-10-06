package Buchverwaltung;

import java.awt.print.Book;

public class Main {

    public static void main(String[] args) {

        Buch b1 = new Buch("Test1", "P slaveq");

        System.out.println(b1.getAnzahlBuecher());

        Buch b2 = new Buch();

        System.out.println(b2.getAnzahlBuecher());

        Ebook e1 = new Ebook("Grandma", "Salvatore Ganacci", 2, 32456);

        e1.setFormat(1);
        e1.setISBN("Ricky Ross");
        e1.setSeitenzahl(300);
        e1.setUrl("http");

        //e1.printBuch();

        System.out.println(b1.getAnzahlBuecher());
        e1.printBuch();


        //b2 = null;
        //System.runFinalization();
        //.gc();

        //System.out.println(b1.getAnzahlBuecher());

    }


}
