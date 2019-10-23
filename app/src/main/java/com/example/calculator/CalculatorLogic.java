package com.example.calculator;

public class CalculatorLogic {
    Double total = 0.00;  //total calculated value

    public String calculate(String mathEquation) {
        System.out.println("in calculate");
        for(int i = 0; i < mathEquation.length(); i++){
            char ch1 = mathEquation.charAt(i);
            System.out.println("index: " + i + ", value: " + ch1);
        }
        return "done ";
    }
    public void addition() {

    }
    public void subtraction() {

    }
    public void multiplication() {

    }
    public void division() {

    }

}
