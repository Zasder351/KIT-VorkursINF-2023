import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mo2Za2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> romanToArab = new HashMap<>();
        romanToArab.put('I', 1);
        romanToArab.put('V', 5);
        romanToArab.put('X', 10);
        romanToArab.put('L', 50);
        romanToArab.put('C', 100);
        romanToArab.put('D', 500);
        romanToArab.put('M', 1000);

        char[] input = scanner.nextLine().toCharArray();
        int finalAnswer = 0;

        for (int i = 0; i < input.length; i++) {

            if ( i + 1 < input.length && romanToArab.get(input[i]) < romanToArab.get(input[i+1])){

                finalAnswer += romanToArab.get(input[i+1]) - romanToArab.get(input[i]);
                i += 1;

            } else if ( i + 2 < input.length && romanToArab.get(input[i]) == romanToArab.get(input[i + 1]) && romanToArab.get(input[i]) == romanToArab.get(input[i + 2])){

                finalAnswer += romanToArab.get(input[i]) * 3;
                i += 2;

            } else if (i + 1 < input.length && romanToArab.get(input[i]) == romanToArab.get(input[i + 1])){

                finalAnswer += romanToArab.get(input[i]) * 2;
                i += 1;

            } else {
                finalAnswer += romanToArab.get(input[i]);
            }

        }
        
        System.out.println(finalAnswer);




    }
}
