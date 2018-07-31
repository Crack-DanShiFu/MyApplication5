package com.example.crack.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Greeter("LCZ").greet()
    }
}
class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}