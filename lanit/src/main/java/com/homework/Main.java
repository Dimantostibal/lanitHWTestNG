package com.homework;

import com.homework.calculator.Calculator;
import com.homework.calculator.ParsInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для выхода из калькулятора нажмите Enter");
        System.out.println("----------------------");
        System.out.println("Введите выражени, каждый символ разделяя пробелом: ");
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            ParsInput parsInput = new ParsInput();
            String[] parsedInput = parsInput.pars(input);
            String operator = parsedInput[1];
            double value1 = Double.parseDouble(parsedInput[0]);
            double value2 = Double.parseDouble(parsedInput[2]);

            Calculator calculator = new Calculator(value1, value2);

            switch (operator) {
                case "+":
                    calculator.sum();
                    break;
                case "-":
                    calculator.sub();
                    break;
                case "/":
                    calculator.div();
                    break;
                case "*":
                    calculator.mul();
                    break;
            }

            if (value1 == 0 || value2 == 0) {
                System.out.println("Деление на 0!");
            } else if ((int) value1 == value1 || (int) value2 == value2) {
                System.out.println("Ответ: " + calculator.getResultInteger());
            } else {
                System.out.println("Ответ: " + calculator.getResultDouble());
            }
            System.out.println("Введите следующее выражение: ");
            input = scanner.nextLine();
        }
    }
}