package Mo8Za2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleFunction;

public class StudentIn extends Kontaktdaten {

    @Override
    public void setStrasse(String newStrasse){

        strasse += addNew(strasse.length(), newStrasse);

    }

    @Override
    public void setHausnummer(String newHausnummer){

        hausnummer += addNew(hausnummer.length(), newHausnummer);

    }

    @Override
    public void setPLZ(String newPLZ){

        plz += addNew(plz.length(), newPLZ);

    }

    @Override
    public void setOrt(String newOrt){

        ort += addNew(ort.length(), newOrt);

    }

    @Override
    public void setTelefonnummer(String newTelefonnummer){

       telefonnummer += addNew(telefonnummer.length(), newTelefonnummer);

    }

    @Override
    public void setEmail(String newEmail){

        email += addNew(email.length(), newEmail);

    }

    private String addNew (int length, String addNewValue){
        String adding = "";

        if (length > 0){
            adding += ", " + addNewValue;
        } else {
            adding += addNewValue;
        }

        return adding;
    }


    public void addKontaktdaten(String addTo, String kontaktdaten){

        switch (addTo){
            case "Straße":
                setStrasse(kontaktdaten);
                break;
            case "Hausnummer":
                setHausnummer(kontaktdaten);
                break;
            case "Postleitzahl":
                setPLZ(kontaktdaten);
                break;
            case "Ort":
                setOrt(kontaktdaten);
                break;
            case "Telefonnummer":
                setTelefonnummer(kontaktdaten);
                break;
            case "E-Mail":
                setEmail(kontaktdaten);
                break;
            default:
                break;

        }

    }

    private void printParameter(String printFrom, String datenTyp){

        if (printFrom.length() > 0){
            System.out.printf("%s: %s%n", datenTyp, printFrom);
        }


    }

    public void printKontaktdaten(){

        printParameter(getStrasse(), "Straße");
        printParameter(getHausnummer(), "Hausnummer");
        printParameter(getPlz(), "Postleitzahl");
        printParameter(getOrt(), "Ort");
        printParameter(getTelefonnummer(), "Telefonnummer");
        printParameter(getEmail(), "E-Mail");



    }


}
