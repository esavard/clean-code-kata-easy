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
 fun testC() {
    // Test cases for the c function
    assertEquals(5.0, Main.c(2.0, 3.0, 1)) // Addition
    assertEquals(-1.0, Main.c(2.0, 3.0, 2)) // Subtraction
    assertEquals(6.0, Main.c(2.0, 3.0, 3)) // Multiplication
    assertEquals(0.6666666666666666, Main.c(2.0, 3.0, 4)) // Division
 }
}