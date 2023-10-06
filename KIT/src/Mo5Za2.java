import java.util.Locale;
import java.util.Scanner;

public class Mo5Za2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\.");
        Datum date = new Datum();

        date.setTag(input[0]);
        date.setMonat(input[1]);
        date.setJahr(input[2]);


        System.out.println(date.dayOfWeek(date));
        System.out.println();

    }

}
