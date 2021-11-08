package com.homework.steps;

import org.testng.annotations.DataProvider;

public class MathTestProviders {

    //for sum
    @DataProvider
    public Object[][] testEqualsSum() {
        return new Object[][]{
                {4.2, 2.1, 2.1},
                {0, -2.1, 2.1},
                {0.1, 0, 0.1},
                {20.8, 9.9, 10.9},
                {10, 0.1, 9.9},
                {1, 0, 1},
                {21, 10, 11},
                {11, 1, 10},
                {8, -1, 9}
        };
    }

    @DataProvider
    public Object[][] testNotEqualsSum() {
        return new Object[][]{
                {6, 2.2, 2.2},
                {0.2, 0, 0.1},
                {20.9, 9.9, 10.9},
                {6, 3, 4},
                {6, 'a', 4}
        };
    }

    //for sub
    @DataProvider
    public Object[][] testEqualsSub() {
        return new Object[][]{
                {2.2, 4.4, 2.2},
                {-2.1, 0, 2.1},
                {0.1, 0.1, 0},
                {9.9, 20.8, 10.9},
                {0.1, 10, 9.9},
                {0, 1, 1},
                {10, 21, 11},
                {1, 11, 10},
                {-1, 8, 9}
        };
    }

    @DataProvider
    public Object[][] testNotEqualsSub() {
        return new Object[][]{
                {1, 2.2, 2.2},
                {0, 0, 0.1},
                {1.1, 9.9, 10.9},
                {-2, 3, 4},
                {-2, 'a', 4},
        };
    }

    //for division
    @DataProvider
    public Object[][] testEqualsDiv() {
        return new Object[][]{
                {2, 4.4, 2.2},
                {2.1, 2.1, 1},
                {1, 0.1, 0.1},
                {0.91, 9.9, 10.9},
                {1.01, 10, 9.9},
                {1, 1, 1},
                {1.91, 21, 11},
                {1.1, 11, 10},
                {-0.22, -2, 9}
        };
    }

    @DataProvider
    public Object[][] testNotEqualsDiv() {
        return new Object[][]{
                {0.99, 2.2, 2.2},
                {1, 0.1, 0},
                {0.90, 9.9, 10.9},
                {0.76, 3, 4},
                {0.76, 'a', 4}
        };
    }

    //for multiplication
    @DataProvider
    public Object[][] testEqualsMul() {
        return new Object[][]{
                {9.68, 4.4, 2.2},
                {0, 0, 2.1},
                {0.01, 0.1, 0.1},
                {107.91, 9.9, 10.9},
                {99, 10, 9.9},
                {1, 1, 1},
                {231, 21, 11},
                {110, 11, 10},
                {-18, 2, -9}
        };
    }

    @DataProvider
    public Object[][] testNotEqualsMul() {
        return new Object[][]{
                {4.85, 2.2, 2.2},
                {0.2, 0, 0.1},
                {108, 9.9, 10.9},
                {11.9, 3, 4},
                {11.9, 'a', 4}
        };
    }
}
