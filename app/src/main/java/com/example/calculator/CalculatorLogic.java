package com.example.calculator;

// This class contains all the logic for a basic calculator application
// No B.E.D.M.A.S.S functionality included, calculations are done
public class CalculatorLogic {
    Double total = 0.00;  //total calculated value

    public String equal(String mathEquation) {
        String[] splitMathEquation = mathEquation.split("\\s+");
        total = Double.valueOf(splitMathEquation[0]);

        for(int i = 1; i < splitMathEquation.length; i+=2){

        }
        return "equal button hit";
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
