package View;

import java.util.Scanner;

public class RusView implements iView {

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public String continueCalculation() {
        return "Повторить вычисления? (Y/N) ";
    }

    @Override
    public String createExpression() {
        return "Введите число: ";
    }

    @Override
    public String selectOperation() {
        return "Выберите операцию: + - * / = ";
    }

    @Override
    public String inputNextArg() {
        return "Введите следующий аргумент: ";
    }

    @Override
    public String presentResult() {
        return "Текущий результат: ";
    }

    @Override
    public void errorCommand() {
        System.out.println("Не верная команда. Попробуйте ещё раз.");
    }

    @Override
    public String insertion(String message) {
        return ("(" + message + ")");
    }
}
