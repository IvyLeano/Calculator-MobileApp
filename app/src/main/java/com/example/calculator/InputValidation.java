package com.example.calculator;
import java.lang.*;

// this class contains all the logic for validating user input
public class InputValidation {

    //returns false if the user is attempting to select the same operation (+,-,/,*) consecutively
    public boolean isOperationInputValid(String mathEquation){
        boolean isOperationValid = false;
        if(!isEmpty(mathEquation)) {
            // this boolean checks to see if the last character is a ' '
            // operations are entered with spaces (' + ', ' - ', ' / ', ' * '), numbers are not
            isOperationValid = getCharAtLastIndex(mathEquation) != ' ' && getCharAtLastIndex(mathEquation) != '.';
        }
        return isOperationValid;
    }
    //returns the formatted string for decimals entered
    public String formatDecimalInput(String mathEquation){
        String formattedDecimal = "";
        boolean isLastInputAnOperation = getCharAtLastIndex(mathEquation) == ' ';

        if(isEmpty(mathEquation) || isLastInputAnOperation){
            formattedDecimal = "0.";
        }
        else if(isDecimalInputValid(mathEquation)){
            formattedDecimal = ".";
        }
        return formattedDecimal;
    }
    // returns false if decimal is repeated in a given number
    public boolean isDecimalInputValid(String mathEquation){
        String[] splitMathEquation = mathEquation.split("\\s+");
        boolean isDecimalValid = splitMathEquation[splitMathEquation.length - 1].indexOf('.') == -1;
        return isDecimalValid;
    }
    //returns true if string is empty
    public boolean isEmpty(String mathEquation){
        return mathEquation.length() < 1;
    }
    //returns last user input character
    public char getCharAtLastIndex(String mathEquation) {
        return mathEquation.charAt(mathEquation.length() - 1);
    }
}
