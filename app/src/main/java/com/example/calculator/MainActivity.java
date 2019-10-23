package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Double total = 0.00;  //total calculated value
    String mathEquation = "";  //the mathematical equation in string form
    TextView calculatorScreen = null;

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

        final View.OnClickListener calculatorListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final int id = v.getId();

                switch(id) {
                    case R.id.n0:
                        if(mathEquation != ""){
                            mathEquation+= "0";
                        }
                        updateTextView();
                        break;
                    case R.id.n1:
                        mathEquation+= "1";
                        updateTextView();
                        break;
                    case R.id.n2:
                        mathEquation+= "2";
                        updateTextView();
                        break;
                    case R.id.n3:
                        mathEquation+= "3";
                        updateTextView();
                        break;
                    case R.id.n4:
                        mathEquation+= "4";
                        updateTextView();
                        break;
                    case R.id.n5:
                        mathEquation+= "5";
                        updateTextView();
                        break;
                    case R.id.n6:
                        mathEquation+= "6";
                        updateTextView();
                        break;
                    case R.id.n7:
                        mathEquation+= "7";
                        updateTextView();
                        break;
                    case R.id.n8:
                        mathEquation+= "8";
                        updateTextView();
                        break;
                    case R.id.n9:
                        mathEquation+= "9";
                        updateTextView();
                        break;
                    case R.id.dot:
                        if(mathEquation == ""){
                            mathEquation+= "0.";
                        }
                        else {
                            mathEquation+= ".";
                        }
                        updateTextView();
                        break;
                    case R.id.equals:
                        System.out.println("***************************************************");
                        mathEquation+= " = ";
                        updateTextView();
                        calculate();
                        break;
                    case R.id.addition:
                        mathEquation+= " + ";
//                        addition();
                        updateTextView();
                        break;
                    case R.id.subtraction:
                        mathEquation+= " - ";
//                        subtraction();
                        updateTextView();
                        break;
                    case R.id.multiplication:
                        mathEquation+= " * ";
//                        multiplication();
                        updateTextView();
                        break;
                    case R.id.division:
                        mathEquation+= " / ";
//                        division();
                        updateTextView();
                        break;
                }

                System.out.println("mathEquation: " + mathEquation);
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
    }
    public void updateTextView() {
        calculatorScreen.setText(mathEquation);
    }
    public void calculate() {
        System.out.println("in calculate");
        for(int i = 0; i < mathEquation.length(); i++){
            char ch1 = mathEquation.charAt(i);
            System.out.println("index: " + i + ", value: " + ch1);
        }

        clearString();
//        mathEquation+= "= " + total.toString();
    }
    public void addition() {

    }
    public void subtraction() {
//        mathEquation+= " - ";
    }
    public void multiplication() {
//        mathEquation+= " * ";
    }
    public void division() {
//        mathEquation+= " / ";
    }
    public void clearString() {
//        mathEquation = "";
    }
}
