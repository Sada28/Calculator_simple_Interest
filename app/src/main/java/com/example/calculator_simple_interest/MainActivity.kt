package com.example.calculator_simple_interest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val et1 =findViewById<EditText>(R.id.et1)
        val et2 =findViewById<EditText>(R.id.et2)
        val et3 =findViewById<EditText>(R.id.et3)
        val tv2 =findViewById<TextView>(R.id.tv2)
        val btn1 =findViewById<Button>(R.id.btn1)
        val btn2 =findViewById<Button>(R.id.btn2)

        btn1.setOnClickListener{
          val p =et1.text.toString().toFloat()
          val r =et2.text.toString().toFloat()
          val t =et3.text.toString().toFloat()
          val si = p*r*t/100
            tv2.setText("Total Simple Interest="+si.toString())

        }
        btn2.setOnClickListener {
            et1.setText(null)
            et2.setText(null)
            et3.setText(null)
            tv2.setText(null)
        }
    }

}