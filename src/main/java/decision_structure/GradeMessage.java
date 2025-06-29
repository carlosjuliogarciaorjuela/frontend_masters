package decision_structure;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        System.out.printf("Enter your letter grade: ");

        Scanner scanner  = new Scanner(System.in);
        String grade  = scanner.next();
        scanner.close();

        String message;

        switch (grade){
            case "A":
                message = "Excellent job";
                break;
            case "B":
                message = "Great job";
                break;

            case "C":
                message = "Good job!";
                break;

            case "D":
                message = "You need to work a bit harder";
                break;

            case "F":
                message = "Uh oh!";
                break;

            default:
                message = "Error, Invalid grade";
                break;
        }

        System.out.printf(message);





    }
}
