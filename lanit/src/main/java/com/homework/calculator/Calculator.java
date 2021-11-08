package com.homework.calculator;

public class Calculator implements CalculatorMethods {

    private double num1;
    private double num2;
    private double result;

    public Calculator(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double sum() {
        result = num1 + num2;
        String strResult = String.format("%.2f", result);
        return Double.parseDouble(strResult.replace(",", "."));
    }

    @Override
    public double sub() {
        result = num1 - num2;
        String strResult = String.format("%.2f", result);
        return Double.parseDouble(strResult.replace(",", "."));
    }

    @Override
    public double div() {
        result = num1 / num2;
        String strResult = String.format("%.2f", result);
        return Double.parseDouble(strResult.replace(",", "."));
    }

    @Override
    public double mul() {
        result = num1 * num2;
        String strResult = String.format("%.2f", result);
        return Double.parseDouble(strResult.replace(",", "."));
    }

    @Override
    public int getResultInteger() {
        return (int) result;
    }

    @Override
    public double getResultDouble() {
        return result;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}