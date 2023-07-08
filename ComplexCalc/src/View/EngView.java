package View;

import java.util.Scanner;

public class EngView implements iView {
    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public String continueCalculation() {
        return "Do you want to continue calculations? (Y/N)";
    }

    @Override
    public String createExpression() {
        return "Enter number: ";
    }

    @Override
    public String selectOperation() {
        return "Select operation: + - * / =";
    }

    @Override
    public String inputNextArg() {
        return "Enter next number: ";
    }

    @Override
    public String presentResult() {
        return "Result: ";
    }

    @Override
    public void errorCommand() {
        System.out.println("Wrong command. Try again.");
    }

    @Override
    public String insertion(String message) {
        return ("(" + message + ")");
    }
}