package de.logerbyte.mylibrary;

import org.junit.*;

import de.logerbyte.mylibrary.javaClasses.MyLibCalculatorJava;

public class CalculatorTest_Java {
    public MyLibCalculatorJava classToTest;

    @Before
    public void setUp() {
        classToTest = new MyLibCalculatorJava();
    }

    @Test
    public void calculate() {
        assert (classToTest.calculate(2, 2) == 4);
    }

}
