package Mo8Za2;

public class Main {

    public static void main(String[] args) {

        StudentIn test = new StudentIn();

        test.addKontaktdaten("Straße", "Yastrebets");
        test.addKontaktdaten("E-Mail", "r_v_");
        test.addKontaktdaten("Ort", "Sofia");
        test.addKontaktdaten("Telefonnummer", "1");
        test.addKontaktdaten("Telefonnummer", "2");
        test.addKontaktdaten("Telefonnummer", "3");
        test.addKontaktdaten("Straße", "Guz");
        test.addKontaktdaten("Ort", "Stara Guzora");

        test.printKontaktdaten();
    }

}
