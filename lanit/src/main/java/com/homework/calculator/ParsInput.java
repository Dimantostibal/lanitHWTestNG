package com.homework.calculator;

import java.util.Scanner;

public class ParsInput {

    public ParsInput() {
    }

    public String[] pars(String input) {
        String[] pars_input = input.split(" ");
        if (pars_input.length != 3) {
            Scanner newScanner = new Scanner(System.in);
            System.out.println("Неверный формат ввода. Нужны пробелы между символами");
            input = newScanner.nextLine();
            return pars(input);
        } else {
            return pars_input;
        }
    }
}