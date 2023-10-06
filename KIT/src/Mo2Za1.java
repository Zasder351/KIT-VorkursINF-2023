import java.sql.Array;
import java.util.Scanner;

public class Mo2Za1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int biggestNumber = 0;
        int lowestNumber = 0;
        int needed = 0;

        for (int i = 0; i < input.length; i++) {
            int currentNumber = Integer.parseInt(input[i]);

            if (currentNumber > biggestNumber && i != 0) {

                lowestNumber = biggestNumber;
                biggestNumber = currentNumber;
                i = - 1;

            }else if (currentNumber == biggestNumber) {


            }else if (currentNumber > biggestNumber){

                biggestNumber = currentNumber;

            } else if (currentNumber < lowestNumber || lowestNumber == 0){

                needed = lowestNumber;
                lowestNumber = currentNumber;


            } else{

                needed = currentNumber;


            }



        }


        System.out.println(needed);






    }


}
