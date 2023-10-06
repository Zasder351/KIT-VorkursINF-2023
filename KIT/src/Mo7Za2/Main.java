package Mo7Za2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CalculateFibonacci test = new CalculateFibonacci();
        Scanner scanner = new Scanner(System.in);
        int position = Integer.parseInt(scanner.nextLine());


        System.out.println(test.calculate(position));

    }

}
