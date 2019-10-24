package com.example.calculator;

// This class contains all the logic for a basic calculator application
// No B.E.D.M.A.S.S functionality included, calculations are done
public class CalculatorLogic {
    Double total = 0.00;  //total calculated value

    public String equal(String mathEquation) {
        String[] splitMathEquation = mathEquation.split("\\s+");
        total = Double.valueOf(splitMathEquation[0]);

        for(int i = 1; i < splitMathEquation.length; i+=2){
            if(splitMathEquation[i].equals("+")){
                addition(Double.valueOf(splitMathEquation[i + 1]));
            }
            else if(splitMathEquation[i].equals("-")){
                subtraction(Double.valueOf(splitMathEquation[i + 1]));
            }
            else if(splitMathEquation[i].equals("*")){
                multiplication(Double.valueOf(splitMathEquation[i + 1]));
            }
            else {
                division(Double.valueOf(splitMathEquation[i + 1]));
            }
        }
        return total.toString();
    }
    public void addition(Double value) {
        total+=value;
    }
    public void subtraction(Double value) {
        total-=value;
    }
    public void multiplication(Double value) {
        total*=value;
    }
    public void division(Double value) {
        total/=value;
    }

}
