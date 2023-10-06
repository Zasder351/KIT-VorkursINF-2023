package Mo9Za1;

public class Verkaufsobject implements Dimensioning, SalesObject{

    private String modellname;
    private String farbe;
    private String artikelnummer;
    private String hersteller;
    private double hoehe;
    private double breite;
    private double tiefe;
    private double preis;
    private String zahlungsart;


    public void setModellname(String modellname) {
        this.modellname = modellname;
    }

    public String getModellname() {
        return modellname;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setArtikelnummer(String artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public String getArtikelnummer() {
        return artikelnummer;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getHersteller() {
        return hersteller;
    }


    @Override
    public void setHoehe(double newHoehe) {
        hoehe = newHoehe;
    }

    @Override
    public double getHoehe() {
        return hoehe;
    }

    @Override
    public void setBreite(double newBreite) {
        breite = newBreite;
    }

    @Override
    public double getBreite() {
        return breite;
    }

    @Override
    public void setTiefe(double newTiefe) {
        tiefe = newTiefe;
    }

    @Override
    public double getTiefe() {
        return tiefe;
    }


    @Override
    public void setPreis(double newPreis) {
        preis = newPreis;
    }

    @Override
    public double getPreis() {
        return preis;
    }


    @Override
    public void setZahlungsart(String newZahlungsart) {
        zahlungsart = newZahlungsart;
    }

    @Override
    public String getZahlungsart() {
        return zahlungsart;
    }

    public void print(){
        System.out.println(getArtikelnummer());
        System.out.println(getModellname());
        System.out.println(getHersteller());
        System.out.println(getFarbe());

        System.out.println(getHoehe());
        System.out.println(getTiefe());
        System.out.println(getBreite());
    }
}
