package de.logerbyte.mylibrary;

import org.junit.*;

import de.logerbyte.mylibrary.javaClasses.Calculator_Java;

public class CalculatorTest_Java {
    public Calculator_Java classToTest;

    @Before
    public void setUp() {
        classToTest = new Calculator_Java();
    }

    @Test
    public void calculate() {
        assert (classToTest.calculate(2, 2) == 4);
    }

}
