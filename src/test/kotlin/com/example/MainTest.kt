package com.example

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainTest {

@BeforeEach
 fun setUp() {
 }

@AfterEach
 fun tearDown() {}

@Test
 fun performOperation_should_add_numbers() {
    assertEquals(5.0, Main.performOperation(2.0, 3.0, OperationType.ADDITION))
 }

@Test
fun performOperation_should_subtract_numbers() {
    assertEquals(-1.0, Main.performOperation(2.0, 3.0, OperationType.SUBTRACTION))
}

@Test
fun performOperation_should_multiply_numbers() {
    assertEquals(6.0, Main.performOperation(2.0, 3.0, OperationType.MULTIPLICATION))
}

@Test
fun performOperation_should_divide_numbers() {
    assertEquals(0.6666666666666666, Main.performOperation(2.0, 3.0, OperationType.DIVISION))
}

@Test
fun performOperation_should_return_nan_for_zero_division() {
    assertEquals(Double.NaN, Main.performOperation(0.0, 0.0, OperationType.DIVISION))
}

@Test
fun performOperation_should_throw_exception_for_invalid_operation() {
    assertThrows(IllegalArgumentException::class.java) {
        Main.performOperation(2.0, 3.0, OperationType.valueOf("NOP"))
    }
 }
}