package com.example.calculator;

// This class contains logic for a basic calculator application
public class CalculatorLogic {
    Double total = 0.00;  //total calculated value

    //Functions that set the 'total' value
    public void addition(Double value) {
        total += value;
    }
    public void subtraction(Double value) {
        total -= value;
    }
    public void multiplication(Double value) {
        total *= value;
    }
    public void division(Double value) {
        total /= value;
    }
    //This function returns the 'total' value in string form
    public String equal(String mathEquation) {
        //Separates string by spaces
        String[] splitMathEquation = mathEquation.split("\\s+");
        total = Double.valueOf(splitMathEquation[0]);
        //Every second index is an operation
        for (int i = 1; i < splitMathEquation.length - 1; i += 2) {
            if (splitMathEquation[i].equals("+")) {
                addition(Double.valueOf(splitMathEquation[i + 1]));
            } else if (splitMathEquation[i].equals("-")) {
                subtraction(Double.valueOf(splitMathEquation[i + 1]));
            } else if (splitMathEquation[i].equals("*")) {
                multiplication(Double.valueOf(splitMathEquation[i + 1]));
            } else {
                division(Double.valueOf(splitMathEquation[i + 1]));
            }
        }
        return total.toString();
    }
}
