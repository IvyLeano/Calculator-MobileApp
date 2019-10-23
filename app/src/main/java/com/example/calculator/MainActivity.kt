package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.mylayout.*

class MainActivity : AppCompatActivity() {
    var total = 0.00;
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.mylayout)

    }

    //Mathematical logic functions
    fun addition(value: Double) : Double {
        var tempTotal = total;
        return tempTotal;
    }
    fun subtraction(value: Double) : Double {
        var tempTotal = total;
        return tempTotal;
    }
    fun division(value: Double) : Double {
        var tempTotal = total;
        return tempTotal;
    }
    fun multiplication(value: Double) : Double {
        var tempTotal = total;
        return tempTotal;
    }
    fun clear(){
        total = 0.00;
    }
}
