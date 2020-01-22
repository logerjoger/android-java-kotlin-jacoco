package de.logerbyte.jacocotest;

import org.junit.*;

import de.logerbyte.jacocotest.javaClasses.Calculator_Java;

public class CalculatorAppTest_Java {
    private Calculator_Java classToTest;

    @Before
    public void setUp() {
        classToTest = new Calculator_Java();
    }

    @Test
    public void calculate() {
        assert (classToTest.calculate(2, 2) == 4);
    }

}
