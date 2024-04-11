import java.util.Scanner;

public class minMaxChallange {

    public static void main(String[] args) {

        double min = 0;
        double max = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a value");
            String a = scanner.nextLine();
            try {

                double x = Double.parseDouble(a);

                if(x > max || max == 0) {
                    max = x;
                }

                if(x < min || min == 0) {
                    min = x;
                }

            } catch(NumberFormatException nfe) {
                System.out.println("You have entered a non-number");
                System.out.println("The max value is: " + max + ", The min value is: " + min);
                break;
            }
        } while (true);
    }
}
