package Mo9Za2;

import java.util.Scanner;

public class Hauptprogramm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Spieler test = new Spieler();

        String input = scanner.nextLine();

        String output = "";
        for (int i = 0; i < 10; i++) {

            output = test.modify(input);
            input = output;
        }

        System.out.println(output);
    }

}
