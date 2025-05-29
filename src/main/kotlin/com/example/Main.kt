package com.example

// This is a simple Kotlin program to demonstrate "dirty" code
// Your goal is to make it clean!
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val a = 2.0
        val b = 3.0

        for (i in 1..4) {
            println("operation $i: $a $b = " + c(a, b, i))
        }
    }

    fun c(a: Double, b: Double, t: Int): Double {
        return when (t) {
            1 -> a + b
            2 -> a - b
            3 -> a * b
            4 -> a / b
            else -> { return a / b } // Default case, should not happen
        }
    }
}