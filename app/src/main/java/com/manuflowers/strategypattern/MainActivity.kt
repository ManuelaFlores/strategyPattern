package com.manuflowers.strategypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    //Usa el contexto para cambiar el comportamiento cuando cambia la estrategia:
    private fun init() {
        val operationAdd = Context(OperationAdd()).excecuteStrategy(10, 9)
        Log.e("STRATEGY", "Add - $operationAdd")

        val operationSubstract = Context(OperationSubstract()).excecuteStrategy(20, 5)
        Log.e("STRATEGY", "Substract - $operationSubstract")

        val operationMultiply = Context(OperationMultiply()).excecuteStrategy(30, 30)
        Log.e("STRATEGY", "Multiply - $operationMultiply")
    }
}
