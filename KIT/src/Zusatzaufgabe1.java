import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Zusatzaufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double p = Double.parseDouble(scanner.nextLine());
        double q = Double.parseDouble(scanner.nextLine());

        double[] x = new double[2];
        double x1 = 0;
        double x2 = 0;
        //x^2 + p*x + q = 0 - check if true

        //x1 = -(p/2) + Math.pow(((Math.pow(p/2, 2)) - q), 0.5);
        //x[1] = -(p/2) + Math.pow(((Math.pow(p/2, 2)) - q), 0.5);

        for (int i = 0; i < 2; i++) {
            double dis = Math.sqrt(((Math.pow(p/2, 2)) - q));

            if (i == 0){
                x[i] = -(p/2) + dis;
            } if (i == 1 ){
                x[i] = -(p/2) - dis;
            }

        }

        //Validation

        for (int i = 0; i < x.length; i++) {
            if (Math.pow(x[i], 2) + x[i] * p + q == 0){
                System.out.println(x[i]);
            } else{
                System.out.println("error");
            }


        }



    }
}
