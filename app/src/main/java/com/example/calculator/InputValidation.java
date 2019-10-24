package com.example.calculator;
import java.lang.*;

//This class contains logic for validating user input
public class InputValidation {

    //Returns false if the user is attempting to select the same operation (+,-,/,*) consecutively
    public boolean isOperationInputValid(String mathEquation){
        boolean isOperationValid = false;
        if(!isEmpty(mathEquation)) {
            //This boolean checks to see if the last character is a ' ' or '.'
            //operations are entered with spaces (' + ', ' - ', ' / ', ' * '), numbers are not
            isOperationValid = getCharAtLastIndex(mathEquation) != ' ' && getCharAtLastIndex(mathEquation) != '.';
        }
        return isOperationValid;
    }
    //Returns the formatted string for decimals entered
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
    //Returns false if '.' is repeated in a given number
    public boolean isDecimalInputValid(String mathEquation){
        String[] splitMathEquation = mathEquation.split("\\s+");
        return splitMathEquation[splitMathEquation.length - 1].indexOf('.') == -1;
    }
    //Returns true if string is empty
    public boolean isEmpty(String mathEquation){
        return mathEquation.length() < 1;
    }
    //Returns last character input
    public char getCharAtLastIndex(String mathEquation) {
        return mathEquation.charAt(mathEquation.length() - 1);
    }
}
