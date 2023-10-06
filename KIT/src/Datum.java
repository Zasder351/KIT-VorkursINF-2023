import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Datum {

    String tag;
    int monat;
    String jahr;

    int indexM;
    int c;
    int y;







    void setTag(String newTag){
        tag = newTag;

    }

    int getTag(){

        return Integer.parseInt(tag);
    }


    void setMonat(String newMonat){
        Map<String, Integer> monatIndex = new HashMap<>();
        monatIndex.put("01", 11);
        monatIndex.put("02", 12);
        monatIndex.put("03", 1);
        monatIndex.put("04", 2);
        monatIndex.put("05", 3);
        monatIndex.put("06", 4);
        monatIndex.put("07", 5);
        monatIndex.put("08", 6);
        monatIndex.put("09", 7);
        monatIndex.put("10", 8);
        monatIndex.put("11", 9);
        monatIndex.put("12", 10);



        monat = Integer.parseInt(newMonat);
        indexM = monatIndex.get(newMonat);

    }

    int getMonat(){
        return monat;
    }

    void setJahr(String newJahr){
        jahr = newJahr;

        String realJahr = "";

        if (monat <= 2){

            realJahr += (Integer.parseInt(jahr) - 1);

        } else {
            realJahr = jahr;
        }

        char[] jahrChars = realJahr.toCharArray();

        String temporaryC = "" + jahrChars[0] + jahrChars[1];
        c = Integer.parseInt(temporaryC);

        String temporaryY = "" + jahrChars[2] + jahrChars[3];
        y = Integer.parseInt(temporaryY);


    }

    int getC(){
        return c;
    }

    int getY(){
        return y;
    }

    String getJahr(){
        return jahr;

    }

    String dayOfWeek(Datum datum){
        double m = indexM;
        int w = 0;
        String day = "";

        int testMid = (int) Math.floor(2.6 * m - 0.2);
        int yDivide = (int) Math.floor(y / 4);
        int cDivide =(int) Math.floor(c / 4);
        int preW = (Integer.parseInt(tag) + testMid + y  + yDivide + cDivide - 2 * c);

        w = mod(preW,7);


        switch (w){
            case 0:
                day = "Sonntag";
                break;
            case 1:
                day = "Montag";
                break;
            case 2:
                day = "Dienstag";
                break;
            case 3:
                day = "Mittwoch";
                break;
            case 4:
                day = "Donnerstag";
                break;
            case 5:
                day = "Freitag";
                break;
            case 6:
                day = "Samstag";
                break;

        }

        return day;
    }

    private int mod(int x, int y)
    {
        int result = x % y;

        if (result < 0)
        {
            result += y;
        }
        return result;
    }








}
