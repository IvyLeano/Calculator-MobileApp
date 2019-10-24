package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Program Variables
    TextView calculatorScreen = null;
    CalculatorLogic calculatorLogic = new CalculatorLogic();
    InputValidation inputValidation = new InputValidation();
    String mathEquation = "";  //the mathematical equation in string form
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculatorScreen = findViewById(R.id.calculatorScreen);

        final Button n0 = findViewById(R.id.n0);
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);
        final Button dot = findViewById(R.id.dot);
        final Button equals = findViewById(R.id.equals);
        final Button addition = findViewById(R.id.addition);
        final Button subtraction = findViewById(R.id.subtraction);
        final Button multiplication = findViewById(R.id.multiplication);
        final Button division = findViewById(R.id.division);
        final Button clear = findViewById(R.id.clear);

        final View.OnClickListener calculatorListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final int id = v.getId();

                switch(id) {
                    case R.id.n0:
                        mathEquation+="0";
                        break;
                    case R.id.n1:
                        mathEquation+="1";
                        break;
                    case R.id.n2:
                        mathEquation+="2";
                        break;
                    case R.id.n3:
                        mathEquation+="3";
                        break;
                    case R.id.n4:
                        mathEquation+="4";
                        break;
                    case R.id.n5:
                        mathEquation+="5";
                        break;
                    case R.id.n6:
                        mathEquation+="6";
                        break;
                    case R.id.n7:
                        mathEquation+="7";
                        break;
                    case R.id.n8:
                        mathEquation+="8";
                        break;
                    case R.id.n9:
                        mathEquation+="9";
                        break;
                    case R.id.dot:
                        mathEquation+=inputValidation.formatDecimalInput(mathEquation);
                        break;
                    case R.id.equals:
                        mathEquation = calculatorLogic.equal(mathEquation);
                        break;
                    case R.id.addition:
                        if(inputValidation.isOperationInputValid(mathEquation)){
                            mathEquation+=" + ";
                        }
                        break;
                    case R.id.subtraction:
                        if(inputValidation.isOperationInputValid(mathEquation)){
                            mathEquation+=" - ";
                        }
                        break;
                    case R.id.multiplication:
                        if(inputValidation.isOperationInputValid(mathEquation)){
                            mathEquation+=" * ";
                        }
                        break;
                    case R.id.division:
                        if(inputValidation.isOperationInputValid(mathEquation)){
                            mathEquation+=" / ";
                        }
                        break;
                    case R.id.clear:
                        mathEquation = "";
                        break;
                }
                calculatorScreen.setText(mathEquation);
            }
        };
        n0.setOnClickListener(calculatorListener);
        n1.setOnClickListener(calculatorListener);
        n2.setOnClickListener(calculatorListener);
        n3.setOnClickListener(calculatorListener);
        n4.setOnClickListener(calculatorListener);
        n5.setOnClickListener(calculatorListener);
        n6.setOnClickListener(calculatorListener);
        n7.setOnClickListener(calculatorListener);
        n8.setOnClickListener(calculatorListener);
        n9.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        equals.setOnClickListener(calculatorListener);
        addition.setOnClickListener(calculatorListener);
        subtraction.setOnClickListener(calculatorListener);
        multiplication.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);
        clear.setOnClickListener(calculatorListener);
    }
}
