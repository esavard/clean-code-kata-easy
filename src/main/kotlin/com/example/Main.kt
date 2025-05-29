package com.example

// This is a simple Kotlin program to demonstrate "dirty" code
// Your goal is to make it clean!
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val firstNumber = 2.0
        val secondNumber = 3.0

        for (operation in OperationType.entries) {
            println("operation: $firstNumber ${operation.getSymbol()} $secondNumber = " + performOperation(firstNumber, secondNumber, operation))
        }
    }

    fun performOperation(firstNumber : Double, secondNumber : Double, operationType : Enum<OperationType>) : Double {
        return when (operationType) {
            OperationType.ADDITION -> firstNumber + secondNumber
            OperationType.SUBTRACTION -> firstNumber - secondNumber
            OperationType.MULTIPLICATION -> firstNumber * secondNumber
            OperationType.DIVISION -> firstNumber / secondNumber
            else -> throw IllegalArgumentException("Invalid operation type: $operationType")
        }
    }
}