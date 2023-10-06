package Mo9Za2;

public class Spielertyp3 implements Schabernack{


    @Override
    public String modify(String toModify) {
        char[] originalString = toModify.toCharArray();
        String modifiedString = "";

        for (int i = toModify.length() - 1; i >= 0 ; i--) {

            modifiedString += originalString[i];

        }

        return modifiedString;
    }
}
