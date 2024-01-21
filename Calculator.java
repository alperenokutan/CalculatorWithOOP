import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.println("Please enter the second number: ");
            double secondNumber = scanner.nextDouble();

            Calculations calculator = new Calculations(firstNumber, secondNumber);

            System.out.println("Select an action:");
            System.out.println("1 - Addition (+)");
            System.out.println("2 - Subtraction (-)");
            System.out.println("3 - Multiplication (*)");
            System.out.println("4 - Division (/)");

            int choice = scanner.nextInt();

            double result = 0.0;

            switch (choice) {
                case 1:
                    result = calculator.add();
                    break;
                case 2:
                    result = calculator.subtract();
                    break;
                case 3:
                    result = calculator.multiply();
                    break;
                case 4:
                 result = calculator.divide();
                    break;
                default:
                    System.out.println("Invalid selection, please try again.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.println("Do you want to another calculation?");
            System.out.println("1 - Yes");
            System.out.println("2 - No");

            int choiceForContinue = scanner.nextInt();
            if (choiceForContinue != 1) {
                System.out.println("Calculator closing...");
                break;
            }
        }
    }
}