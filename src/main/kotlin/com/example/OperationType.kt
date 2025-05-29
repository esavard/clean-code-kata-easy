package com.example

enum class OperationType {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION;

    fun getSymbol(): String {
        return when (this) {
            ADDITION -> "+"
            SUBTRACTION -> "-"
            MULTIPLICATION -> "*"
            DIVISION -> "/"
        }
    }
}
