package de.logerbyte.jacocotest

import org.junit.Before
import org.junit.Test


class CalculatorAppTest{
    lateinit var classToTest: CalculatorApp

    @Before
    fun setUp() {
        classToTest = CalculatorApp()
    }

    @Test
    fun calculate() {
        assert(classToTest.calculate(2, 2) == 4)
    }

}