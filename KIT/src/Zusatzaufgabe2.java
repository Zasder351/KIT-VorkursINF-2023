import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zusatzaufgabe2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Data
        Map<String, Integer> indexOfMonth = new HashMap<>();
        indexOfMonth.put("Januar", 1);
        indexOfMonth.put("Februar", 2);
        indexOfMonth.put("März", 3);
        indexOfMonth.put("April", 4);
        indexOfMonth.put("Mai", 5);
        indexOfMonth.put("Juni", 6);
        indexOfMonth.put("Juli", 7);
        indexOfMonth.put("August", 8);
        indexOfMonth.put("September", 9);
        indexOfMonth.put("Oktober", 10);
        indexOfMonth.put("November", 11);
        indexOfMonth.put("Dezember", 12);

        Map<Integer, Integer> daysInMonth = new HashMap<>();
        daysInMonth.put(1, 31);
        daysInMonth.put(2, 28);
        daysInMonth.put(3, 31);
        daysInMonth.put(4, 30);
        daysInMonth.put(5, 31);
        daysInMonth.put(6, 30);
        daysInMonth.put(7, 31);
        daysInMonth.put(8, 31);
        daysInMonth.put(9, 30);
        daysInMonth.put(10, 31);
        daysInMonth.put(11, 30);
        daysInMonth.put(12, 31);

        String regex = "\\b(?<day>[0-9]{1,2}). (?<month>[A-Z][a-zä]+)\\b";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        String month = "";
        String day = "";

        if (matcher.find()){
            month = matcher.group("month");
            day = matcher.group("day");
            int T = 0;
            double sunrise = 0;

            if (!indexOfMonth.containsKey(month)){

                System.out.println("Bitte, geben Sie einen korrekten Monat ein!");

            } else if (Integer.parseInt(day) > daysInMonth.get(indexOfMonth.get(month))){

                System.out.println("Bitte, geben Sie einen korrekten Tag ein!");

            } else{

                T += Integer.parseInt(day) + daysPassed(indexOfMonth, daysInMonth, month);
                double ZG = Zeitgleichung(T);
                double DK = Deklination(T);
                double dt = Zeitdifferenz(T, DK);

                sunrise += 12 - dt - ZG - 8.40417/15;

                if (indexOfMonth.get(month) >= 4 && indexOfMonth.get(month) <= 10){
                    sunrise += 2;
                } else  {
                    sunrise += 1;
                }

                int hours = (int) sunrise;
                int minutes = (int) Math.ceil((sunrise - hours) * 60);


                String sunriseTime = String.format("%02d:%02d", hours, minutes);
                System.out.println(sunriseTime);
            }






        } else{
            System.out.println("Bitte, geben Sie ein korrektes Datum ein!");
        }














    }

    public static int daysPassed (Map<String, Integer> indexOfMonth, Map<Integer, Integer> daysInMonth, String month){
        int daysPassed = 0;


        for (int i = 1; i < indexOfMonth.get(month); i++) {

             daysPassed += daysInMonth.get(i);

        }

        return daysPassed;

    }

    public static double Zeitgleichung(Integer T){
        double zg = 0.0;

        zg += -0.171 * Math.sin(0.0337 * T + 0.465) - 0.1299 * Math.sin(0.01787 * T - 0.168);

        return zg;
    }

    public static double Deklination(Integer T){
        double DK = 0.0;

        DK += 0.4095 * Math.sin(0.016906 *( T - 80.086));

        return DK;
    }

    public static double Zeitdifferenz(Integer T, Double DK){
        double dt = 0.0;

        dt += (12 / Math.PI) * Math.acos((Math.sin(-0.0145) - Math.sin(49 * Math.PI / 180) * Math.sin(DK))/(Math.cos(49 * Math.PI / 180) * Math.cos(DK)));

        return dt;
    }

}
