package se.lexicon;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueCalculation = 0;

        do {
            System.out.println("Enter first digit");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second digit");
            double num2 = scanner.nextDouble();

            System.out.println("Choose an operation: +, -, *, /");
            char operation = scanner.next().charAt(0);

            double result;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
                    continue;
            }

            System.out.println("The result is: " + result);

            System.out.println("Do you want to perform another calculation? (y/n)");
            continueCalculation = scanner.next().charAt(0);

        } while (continueCalculation == 'y' || continueCalculation == 'Y');

        scanner.close();
    }
}