package de.logerbyte.jacocotest

import org.junit.Before
import org.junit.Test


class CalculatorTest{
    lateinit var classToTest: Calculator

    @Before
    fun setUp() {
        classToTest = Calculator()
    }

    @Test
    fun calculate() {
        assert(classToTest.calculate(2, 2) == 4)
    }

}