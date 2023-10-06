package Mo9Aufgabe;

public class Person extends PrintObject {

    private String vorname;
    private String nachname;

    public void setVorname(String newVorname){
        vorname= newVorname;
    }

    public String getVorname(){
        return vorname;
    }

    public void setNachname(String newNachname){
        nachname= newNachname;
    }

    public String getNachname(){
        return nachname;
    }

    @Override
    public void print() {
        System.out.printf("%s %s", getNachname(), getVorname());
    }

    @Override
    public String toString() {
        return getNachname() + " " + getVorname();
    }
}
