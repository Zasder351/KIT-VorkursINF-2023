import java.util.Scanner;

public class Mo3Za2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        String binaryTemporary = "";
        while (input != 0){

            binaryTemporary += (input % 2);

            input = (input - input % 2) / 2;

        }

        char[] binaryChar = binaryTemporary.toCharArray();

        String binary = "";

        for (int i = 0; i < 16 - binaryChar.length; i++) {
            binary += 0;
        }


        for (int i = binaryChar.length - 1; i >= 0; i--) {
            binary += binaryChar[i];
        }

        System.out.println(binary);

    }

}
