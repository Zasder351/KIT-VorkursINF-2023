import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Mo4Za2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] board = new int[8][16];
        int turns = 20;
        boolean caught = false;
        int[] currentPosition = new int[2];
        int[] oldPosition = {0, 0};
        char[] newDirections = new char[2];
        int direction = 0;

        //build on start
        for (int i = 0; i < board.length; i++) {


            for (int j = 0; j < board[0].length; j++) {

                if (i % 2 == 1){

                    if (j % 2 == 1){

                        board[i][j] = 1;

                    } else {
                        board[i][j] = 0;
                    }

                } else {

                    if (j % 2 == 1){

                        board[i][j] = 0;

                    } else {
                        board[i][j] = 1;
                    }

                }

            }

        }

        //assigning X and O
        board[0][0] = 2;
        int[] positionX = new int[2];
        positionX[0] = 0;
        positionX[1] = 0;

        int[] positionO = new int[2];
        positionO[0] = randomIntegerX();
        positionO[1] = randomIntegerY();
        board[positionO[1]][positionO[0]] = 3;

        System.out.println("Catch X, if you can...");
        DisplayBoard(board);
        ControlInfo();

        while (turns > 0){

            //get parameters
            int input = Integer.parseInt(scanner.nextLine());
            currentPosition[0] = positionO[0];
            currentPosition[1] = positionO[1];

            oldPosition[0] = positionO[0];
            oldPosition[1] = positionO[1];

            direction = input;

            //calculate new position
            MoveTo(currentPosition, direction);
            //positionO[0] = Integer.parseInt(Character.toString(newDirections[0]));
            //positionO[1] = Integer.parseInt(Character.toString(newDirections[1]));

            positionO[0] = currentPosition[0];
            positionO[1] = currentPosition[1];

            //replace

            board[oldPosition[1]][oldPosition[0]] = Replace(currentPosition, board);

            if (board[positionO[1]][positionO[0]] == 2){

                board[positionO[1]][positionO[0]] = 3;
                System.out.println("X was caught!");
                DisplayBoard(board);
                System.out.println("!!CONGRATULATIONS!!");
                break;

            } else {
                board[positionO[1]][positionO[0]] = 3;
                turns -= 1;
            }









            currentPosition[0] = positionX[0];
            currentPosition[1] = positionX[1];

            oldPosition[0] = positionX[0];
            oldPosition[1] = positionX[1];

            int moveX = (int) (Math.random() * (4 - 1) + 1);
            direction = moveX;
            MoveTo(currentPosition, direction);

            positionX[0] = currentPosition[0];
            positionX[1] = currentPosition[1];

            board[oldPosition[1]][oldPosition[0]] = Replace(currentPosition, board);

            if (board[positionX[1]][positionX[0]] == 3){

                System.out.println("X turned himself in...");
                DisplayBoard(board);
                System.out.println("Good job");
                break;

            } else {
                board[positionX[1]][positionX[0]] = 2;

            }

            Clear();
            DisplayBoard(board);
            //ControlInfo();

        }






    }

    public static void DisplayBoard(int[][] board){
        for (int i = 0; i < board.length; i++) {


            for (int j = 0; j < board[0].length; j++) {

                switch (board[i][j]){
                    case 0:
                        System.out.print("\u2592");
                        break;
                    case 1:
                        System.out.print("\u2593");
                        break;
                    case 2:
                        System.out.print("X");
                        break;
                    case 3:
                        System.out.print("O");
                        break;
                }


            }

            System.out.println();
        }
    }

    public static int randomIntegerX(){
        int min = 0;
        int max = 15;
        int randomX = (int) (Math.random() * (max - min + 1));

        return randomX;
    }

    public static int randomIntegerY(){
        int min = 0;
        int max = 7;
        int randomY = (int) (Math.random() * (max - min + 1));

        return randomY;

    }

    public static void Clear(){
        for (int i = 0; i < 16; i++) {
            System.out.println();
        }
    }

    public static int Replace(int[] currentPosition, int[][] board){
        int object = 0;

        switch (board[currentPosition[1]][currentPosition[0]]){
            case 0:

                object = 1;

                break;
            case 1:

                object = 0;

                break;
            default:

                if (board.length <= currentPosition[1] + 1){

                    switch (board[currentPosition[1] + 1][currentPosition[0]]) {
                        case 0:

                            object = 1;

                            break;
                        case 1:

                            object = 0;

                            break;
                    }
                } else if (currentPosition[1] - 1 >= 0){

                    switch (board[currentPosition[1] - 1][currentPosition[0]]) {
                        case 0:

                            object = 1;

                            break;
                        case 1:

                            object = 0;

                            break;
                    }

                }

                break;
        }



        return object;
    }

    public static String MoveTo(int[] oldPosition, int direction){

        int directions = direction;
        int[] currentCoordinates = oldPosition;

        String newPosition = "";

        switch (directions){
            case 1:
                //Norden
                if (currentCoordinates[1] - 1 >= 0){

                    currentCoordinates[1] -= 1;

                } else {

                }

                break;

            case 2:
                //Osten
                if (currentCoordinates[0] + 1 <= 16){

                    currentCoordinates[0] += 1;

                } else {

                }

                break;

            case 3:
                //Süden
                if (currentCoordinates[1] + 1 <= 8){

                    currentCoordinates[1] += 1;

                } else {

                }

                break;

            case 4:
                //Westen
                if (currentCoordinates[0] - 1 >= 0){

                    currentCoordinates[0] -= 1;

                } else {

                }

                break;

        }

        newPosition += currentCoordinates[0];
        newPosition += currentCoordinates[1];

        return newPosition;
    }

    public static void ControlInfo(){
        System.out.println("Type 1 to go up");
        System.out.println("Type 2 to go right");
        System.out.println("Type 3 to go down");
        System.out.println("Type 4 to go left");

    }

}
