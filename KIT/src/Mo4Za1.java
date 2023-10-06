import java.util.Scanner;

public class Mo4Za1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 6;
        int min = 1;
        int currentRoll = 0;

        int[] rolledHistory = new int[0];




            do{

                currentRoll = (int) (Math.random() * (max - min) + 1);

                if (currentRoll == 1){

                    break;

                } else {
                    int[] newAddition= new int[rolledHistory.length + 1];

                    for (int i = 0; i < rolledHistory.length; i++) {
                        newAddition[i] = rolledHistory[i];


                    }

                    newAddition[rolledHistory.length] = currentRoll;

                    rolledHistory = newAddition;

                }



            } while (currentRoll != 1);

        System.out.println("ready");

        for (int i = 0; i < rolledHistory.length; i++) {
            System.out.print(rolledHistory[i] + " ");
        }



    }

}
