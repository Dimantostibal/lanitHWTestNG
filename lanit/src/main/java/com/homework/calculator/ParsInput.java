package com.homework.calculator;

import java.util.Scanner;

public class ParsInput {

    public ParsInput() {
    }

    public String[] pars(String input) {
        if (input.length() != input.replaceAll("[А-Яа-яA-Za-z]", "").length()) {
            System.out.println("Введены не корректные данные.");
            Scanner newScanner = new Scanner(System.in);
            input = newScanner.nextLine();
            return pars(input);
        }
        String[] pars_input = input.split(" ");
        if (pars_input.length != 3) {
            Scanner newScanner = new Scanner(System.in);
            System.out.println("Неверный формат ввода.");
            input = newScanner.nextLine();
            return pars(input);
        } else {
            return pars_input;
        }
    }
}