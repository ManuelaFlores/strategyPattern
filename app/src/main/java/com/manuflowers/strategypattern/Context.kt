package com.manuflowers.strategypattern

class Context(private val strategy: Strategy) {
    fun excecuteStrategy(num1: Int, num2: Int): Int {
        return strategy.doOperation(num1, num2)
    }
}