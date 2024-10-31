package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // TODO: 1) реализовать проверку на пустые значения в полях numA, numB
    // TODO: 2) исправить разметку, чтобы можно было вводить только числа
    // TODO: 3) сделать поддержку вещественных (не целых чисел)

    fun onClick(v: View) {
        val etA = findViewById<EditText>(R.id.numA)
        val etB = findViewById<EditText>(R.id.numB)
        val tvSum = findViewById<TextView>(R.id.sum)

        val strA = etA.text.toString()
        val strB = etB.text.toString()

        if (strA.length==0){
            tvSum.text = "First field is empty!"
            tvSum.setTextColor(Color.RED)
        }else if(strB.length==0){
            tvSum.text = "Second field is empty!"
            tvSum.setTextColor(Color.RED)
        }else {
            val sum = strA.toFloat() + strB.toFloat()
            val strSum = ((sum * 1000.0).roundToInt() / 1000.0).toString()
            tvSum.text = strSum
            tvSum.setTextColor(Color.BLACK)
        }
    }
}