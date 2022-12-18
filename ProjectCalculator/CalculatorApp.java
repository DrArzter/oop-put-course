package ProjectCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

import ProjectCalculator.src.Calculator;

public class CalculatorApp {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Write two numbers and +, -, * or / sign");
        char operator = 0;
        double firstNum = 0;
        double secondNum = 0;
        try {
            firstNum = getNumberFromInput();
            operator = scanner.next().charAt(0);
            secondNum = getNumberFromInput();
        } catch (InputMismatchException ime) {
            System.out.println("invalid input");
        }
            Calculator calculator = new Calculator(firstNum, secondNum);
            System.out.println(calculator.Calculate(operator));   

    }

    public static double getNumberFromInput(){
        return scanner.nextDouble();

    }

}