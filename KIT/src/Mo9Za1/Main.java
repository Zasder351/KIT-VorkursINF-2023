package Mo9Za1;

public class Main{

    public static void main(String[] args) {

        Verkaufsobject test = new Verkaufsobject();

        test.setBreite(20);
        test.setTiefe(20);
        test.setHoehe(20);

        test.setFarbe("rot");
        test.setHersteller("Bosch");
        test.setArtikelnummer("3546");
        test.setPreis(29.32);

        test.print();

    }

}
