package de.logerbyte.jacocotest;

import org.junit.*;

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
