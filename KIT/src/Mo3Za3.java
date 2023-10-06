import java.util.Locale;
import java.util.Scanner;

public class Mo3Za3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int miss = 5;
        boolean solved = false;
        String currentString = "";

        String givenWord = scanner.nextLine();
        char[] givenWordChar = givenWord.toCharArray();

        currentString = displayWordFirst(givenWordChar);
        System.out.println(currentString);



        while (miss > 0 && !currentString.equals(givenWord)){
            String input = scanner.nextLine();
            String previousString = currentString;

            currentString = changeWord(givenWordChar, givenWord, input, currentString);

            if (currentString.equals(previousString)){
                miss -= 1;
                hangman(miss);
            }


            System.out.println(currentString);
        }

        if (miss <= 0){

            System.out.println("Sie haben verloren!");

        } else {

            System.out.println("Sie haben gewonnen");

        }




    }


    public static String changeWord (char[] givenWordChar, String givenWord, String input, String currentString){

        String checked = "";

        if (input.toLowerCase(Locale.ROOT).equals(givenWord.toLowerCase(Locale.ROOT))){
            checked = input;
        } else {
            char[] givenCurrentChars = currentString.toCharArray();



            for (int i = 0; i < givenWord.length(); i++) {

                if (input.toLowerCase(Locale.ROOT).equals(Character.toString(givenWordChar[i]))){

                    checked += input.toLowerCase(Locale.ROOT);

                } else{

                    checked += givenCurrentChars[i];

                }


            }


        }

        return checked;

    }

    public static String displayWordFirst(char[] givenWordChar){

        String currentString = "";

        currentString += givenWordChar[0];
        for (int i = 1; i < givenWordChar.length - 1; i++) {

            currentString += "_";
        }
        currentString += givenWordChar[givenWordChar.length - 1];

        return currentString;

    }

    public static void hangman (int miss){

        System.out.println("    _____ ");
        System.out.println("    |/  | ");
        if (miss == 4){
            System.out.println("    |   0 ");
            System.out.println("    |   | ");
            System.out.println("    |     ");
        } else if (miss == 3){
            System.out.println("    |   0 ");
            System.out.println("    |   | ");
            System.out.println("    |  /  ");
        } else if (miss == 2){
            System.out.println("    |   0 ");
            System.out.println("    |   | ");
            System.out.println("    |  / |");
        } else if (miss == 1){
            System.out.println("    |   0 ");
            System.out.println("    |   |>");
            System.out.println("    |  / |");
        } else if (miss == 0){
            System.out.println("    |   0 ");
            System.out.println("    |  <|>");
            System.out.println("    |  / |");
        } else
        {
            System.out.println("    |     ");
            System.out.println("    |     ");
            System.out.println("    |     ");
        }

        System.out.println("    |     ");
        System.out.println("____|____ ");


    }

}
