import java.util.Random;
import java.util.Scanner;

public class Mo3Za1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int wantedNum = 0;
        int max = 1000;
        int min = 1;


        do{
            switch (input){
                case "1":

                    max = wantedNum - 1;

                    break;
                case "2":

                    min = wantedNum + 1;

                    break;
                default:

                    break;
            }

            wantedNum = (int) (Math.random() * (max - min) + 1) + min;
            System.out.println(wantedNum);
            input = scanner.nextLine();
        }while (!input.equals("3"));

        System.out.printf("Die Zahl %d ist gefunden!", wantedNum);


    }
}
