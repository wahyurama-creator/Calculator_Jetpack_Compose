package com.way.composecalculator.ui

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation?= null,
)
