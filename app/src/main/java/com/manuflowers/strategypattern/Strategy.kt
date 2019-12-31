package com.manuflowers.strategypattern

interface Strategy {
    fun doOperation(num1: Int, num2: Int): Int
}