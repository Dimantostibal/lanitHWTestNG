package com.homework.steps;

import com.homework.calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MathTest extends MathTestProviders {

    //Testing for sum
    @Test(dataProvider = "testEqualsSum")
    public void testEqualsSum(double one, double two, double tree) {
        Assert.assertEquals(one, new Calculator(two, tree).sum(), "Значения не равны!");
    }

    @Test(dataProvider = "testNotEqualsSum")
    public void testNotEqualsSum(double one, double two, double tree) {
        Assert.assertNotEquals(one, new Calculator(two, tree).sum(), "Значения равны!");
    }

    //Testing for subtraction
    @Test(dataProvider = "testEqualsSub")
    public void testEqualsSub(double one, double two, double tree) {
        Assert.assertEquals(one, new Calculator(two, tree).sub(), "Значения не равны!");
    }

    @Test(dataProvider = "testNotEqualsSub")
    public void testNotEqualsSub(double one, double two, double tree) {
        Assert.assertNotEquals(one, new Calculator(two, tree).sub(), "Значения равны!");
    }

    //Testing for division
    @Test(dataProvider = "testEqualsDiv")
    public void testEqualsDiv(double one, double two, double tree) {
        Assert.assertEquals(one, new Calculator(two, tree).div(), "Значения не равны!");
    }

    @Test(dataProvider = "testNotEqualsDiv")
    public void testNotEqualsDiv(double one, double two, double tree) {
        Assert.assertNotEquals(one, new Calculator(two, tree).div(), "Значения равны!");
    }

    //Testing for multiplication
    @Test(dataProvider = "testEqualsMul")
    public void testEqualsMul(double one, double two, double tree) {
        Assert.assertEquals(one, new Calculator(two, tree).mul(), "Значения не равны!");
    }

    @Test(dataProvider = "testNotEqualsMul")
    public void testNotEqualsMul(double one, double two, double tree) {
        Assert.assertNotEquals(one, new Calculator(two, tree).mul(), "Значения равны!");
    }
}
