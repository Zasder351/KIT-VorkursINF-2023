import java.util.Scanner;

public class Mo3Au33 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = 1000;
        int min = 1;
        int wantedNum = (int) (Math.random() * (max - min) + 1) + min;
        System.out.printf("Ich habe mir eine Zahl von %d bis %d ausgedacht.", min, max);
        System.out.println("Erraten Sie diese Zahl!");
        int input = 0;
        int misses = 1;

        do {



            input = Integer.parseInt(scanner.nextLine());

            if (input == wantedNum){

                System.out.println("Wunderbar, sie haben die Zahl erraten!");
                break;

            } else if (input < wantedNum){
                System.out.printf("Nein, die Zahl, an die ich denke, ist größer als %d%n", input);
                misses += 1;

            } else if (input > wantedNum){

                System.out.printf("Nein, die Zahl, an die ich denke, ist kleiner als %d%n", input);
                misses += 1;
            }

            System.out.println("Versuchen Sie es noch einmal!");

        } while (input != wantedNum);


        if (misses > 1){
            System.out.printf("Sie haben %d Versuche gebraucht", misses);
        } else {
            System.out.println("Sie haben nur einen Versuch gebraucht, beeindruckend!");
        }



    }

}
