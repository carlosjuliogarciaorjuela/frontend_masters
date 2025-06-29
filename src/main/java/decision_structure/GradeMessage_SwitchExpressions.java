package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {

    public static void main(String[] args) {

        System.out.printf("Enter your letter grade: ");

        Scanner scanner  = new Scanner(System.in);
        String grade  = scanner.next();
        scanner.close();

        String message = switch (grade){
            case "A" -> "Excellent job";
            case "B" -> "Great job";
            case "c" -> "Good job!";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error, Invalid grade";
        };

        System.out.printf(message);





    }
}
