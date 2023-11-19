package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.function.ToIntBiFunction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var char:String = ""
    var number:String = ""
    var number2:String = ""
    fun b1Click(v: View) {
        val b1 = v as Button
        val t: TextView = findViewById(R.id.textView1)
        val a: Double?
        val b: Double?
        when (b1?.id){
            R.id.button1 -> t.append("1")
            R.id.button2 -> t.append("2")
            R.id.butC -> t.text = ""
            R.id.but3 -> t.append("3")
            R.id.button4 -> t.append("4")
            R.id.button5 -> t.append("5")
            R.id.button6 -> t.append("6")
            R.id.button7 -> t.append("7")
            R.id.button8 -> t.append("8")
            R.id.button9 -> t.append("9")
            R.id.but0 -> t.append("0")
            R.id.buttonminus -> {
                char = "-"
                number = t.text.toString()
                t.setText("").toString()
            }
            R.id.butplus ->{
                char = "+"
                number = t.text.toString()
                t.setText("").toString()
            }
            R.id.butdelit ->{
                char = "/"
                number = t.text.toString()
                t.setText("").toString()
            }
            R.id.butumno ->{
                char = "*"
                number = t.text.toString()
                t.setText("").toString()
            }
            R.id.buttravno -> b1Itog(number)

        }



    }
    fun b1Itog(number:String){
        var number = number
        val t:TextView = findViewById(R.id.textView1)
        number2 = t.getText().toString()
        when(char){
            "+" -> t.text = (number.toDouble() + number2.toDouble()).toString()
            "-" -> t.text = (number.toDouble() - number2.toDouble()).toString()
            "*" -> t.text = (number.toDouble() * number2.toDouble()).toString()
            "/" -> t.text = (number.toDouble() / number2.toDouble()).toString()
        }
    }

}