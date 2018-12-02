package com.lmao.gayyy.calculatorkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var no1: EditText? = null
    private var no2: EditText? = null
    private val result: EditText? = null
    private var eq: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addListenerOnButton()

    }

    fun addListenerOnButton() {
        no1 = findViewById<View>(R.id.no1) as EditText
        no2 = findViewById<View>(R.id.no2) as EditText
        eq = findViewById<View>(R.id.eq) as Button

        eq!!.setOnClickListener {
            val value1 = no1!!.text.toString()
            val value2 = no2!!.text.toString()
            val a = Integer.parseInt(value1)
            val b = Integer.parseInt(value2)
            val result = a + b
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_LONG).show()
        }
    }
}