package andr;

// Quellcode-Formattierung:
// Zu viele, zu lange Zeilenumbrüche verwendet.
// Man muss den Quellcode nicht per Hand formattieren, sondern kann das
// auch die IDE machen lassen. In eclipse kann man das so machen:
// https://www.eclipse.org/pdt/help/html/formatting_code.htm
import java.util.Scanner;



public class Mo3Au33 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = 1000;
        int min = 1;
		// Dieser Zufallszahlenalgorithmus liefert nur Zahlen zwischen 2 und 1000,
		// nicht wie in der Aufgabenstellung verlangt Zahlen zwischen 1 und 1000.
		// Fix: int wantedNum = (int) (Math.random() * (max - min + 1)) + min;
        int wantedNum = (int) (Math.random() * (max - min) + 1) + min;
        System.out.printf("Ich habe mir eine Zahl von %d bis %d ausgedacht.", min, max);
        System.out.println("Erraten Sie diese Zahl!");
		
		// Der Variable zugewiesener Wert wird nie gelesen, bevor dieser
		// überschrieben oder die Variable ungültig wird.
		// -> Variable erst dort definieren, wo diese verwendet wird.
        int input = 0;
        int misses = 1;

        do {



			// Einfacher: input = scanner.nextInt();
            input = Integer.parseInt(scanner.nextLine());
			
			// Den Code der Bedingung if (input == wantedNum) kann man auch nach dem while schreiben,
			// da im nächsten Schritt die while-Schleife endet.
			// Allerdings müsste die Aufforderung "Versuchen Sie es noch einmal!" in die beiden
			// if-Blöcke verschoben werden, da der Text sonst auch bei einer korrekten Eingabe
			// noch einmal ausgegeben wird.
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
