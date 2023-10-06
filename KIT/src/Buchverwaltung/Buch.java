package Buchverwaltung;

public class Buch {

    private String titel;
    private String autor;
    private String isbn;
    private int seitenzahl;
    private double kaufpreis;
    private static final String verlag = "KIT-Verlag";
    private static int anzahlBuecher;

    public Buch() {

        addBuch();

    }

    public Buch(String newTitel, String newAutor) {

        setTitel(newTitel);
        setAutor(newAutor);
        addBuch();

    }

    public Buch(String newTitel, String newAutor, String newISBN, int newSeitenzahl) {

        setTitel(newTitel);
        setAutor(newAutor);
        setISBN(newISBN);
        setSeitenzahl(newSeitenzahl);

    }


    private void setTitel(String newTitel) {
        titel = newTitel;
    }

    private String getTitel() {
        return titel;
    }

    private void setAutor(String newAutor) {
        autor = newAutor;
    }

    private String getAutor() {
        return autor;
    }

    public void setISBN(String newISBN) {
        isbn = newISBN;
    }

    private String getIsbn() {
        return isbn;
    }

    public void setSeitenzahl(int newSeitenzahl) {
        seitenzahl = newSeitenzahl;
    }

    private int getSeitenzahl() {
        return seitenzahl;
    }

    private double getKaufpreis() {
        return seitenzahl * 0.01;
    }

    private String getVerlag() {
        return verlag;
    }

    public int getAnzahlBuecher() {
        return anzahlBuecher;
    }

    private void addBuch() {
        anzahlBuecher += 1;
    }

    public void printBuch() {

        System.out.println(getTitel());
        System.out.println(getAutor());
        System.out.println(getIsbn());
        System.out.println(getSeitenzahl());
        System.out.println(getKaufpreis());
        System.out.println(getVerlag());

    }

    protected void finalize() {
        anzahlBuecher -= 1;
    }


}
