import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner scan = new Scanner(System.in);

        /*
        while (true){
            System.out.println("Skriv in en veckodag");
            String dag = switch (scan.nextInt()) {
                case 1 -> "monday";
                case 2 -> "tuesday";
                case 3 -> "wednesday";
                case 4 -> "thursday";
                case 5 -> "friday";
                case 6 -> "saturday";
                case 7 -> "sunday";
                default -> "Invalid day";

            };
            System.out.println(dag);
        }
        */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Välj dag (1-7): ");
        int day = scanner.nextInt();

        String name = switch (day){
            case 1 -> name = "Måndag";
            case 2 -> name = "Tisdag";
            case 3 -> name = "Onsdag";
            case 4 -> name = "Torsdag";
            case 5 -> name = "Fredag";
            case 6 -> name = "Lördag!";
            case 7 -> name = "Söndag!";
            default -> null;
        };

        String typAvDag = switch (day){
            case 1, 2, 3, 4, 5 -> "Vardag";
            case 6, 7 -> "Helg!!";
            default -> null;
        };

        if (name != null) {
            System.out.println("Veckodag: " + name + " Det är en: " + typAvDag);
        } else {
            System.out.println("Va ?!? Okänd dag");
        }

        scanner.close();
        }
        */

        /*
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Avfyrning");

        for (int i = 1; i <= 5; i++ ){
            for (int u = 1; u <= 5; u++) {
                System.out.print(i * u + "\t");
            }
            System.out.println();
        }
        */

        for (int i = 1; i <= 100; i++) {
            System.out.println(getFizzBuzz(i));
        }
    }

    public static String getFizzBuzz(int n) {

        String answer = "";

        if (n % 3 == 0 && n % 5 == 0) {
            answer = "FizzBuzz";
        }
        else if (n % 3 == 0) {
            answer = "Fizz";
        }
        else if (n % 5 == 0) {
            answer = "Buzz";
        }
        else {
            answer = String.valueOf(n);
        }

        return answer;
    }
}