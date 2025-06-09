package basics;

import java.util.Locale;
import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        System.out.println("Hoy many hour did you work?");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Add this line

        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate?");

        double rate = scanner.nextDouble();
        scanner.close();

        double payRate = hours * rate;

        System.out.println("Goss Pay: " + payRate);

    }

}
