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

    fun c(a : Double, b : Double, t : Int): Double {
        if (t == 1) {
            return a + b
        } else if (t == 2) {
            return a - b
        } else if (t == 3) {
            return a * b
        } else {
            return a / b
        }
    }
}