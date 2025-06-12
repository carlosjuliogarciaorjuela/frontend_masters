package loops;

import java.util.Scanner;

public class GrossPayInputvalidation {
    public static void main(String[] args) {

        int rate  = 15;
        int maxhours = 40;

        System.out.println("Hoe many hours did yuo work? ");

        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();



        while(hoursWorked > maxhours || hoursWorked <0){
            System.out.println("Invalid entry. Your hours must be between 1 and 40");

            hoursWorked = scanner.nextDouble();

        }

        scanner.close();

        double grossPay = hoursWorked * rate;
        System.out.printf("Gross pay " + grossPay);


    }
}
