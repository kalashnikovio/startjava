package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public int calculate(String inputLine) {
        parseExpression(inputLine);
        switch (sign) {
            case '+' :
                return num1 + num2;
            case '-' :
                return num1 - num2;
            case '*' :
                return num1 * num2;
            case '/' :
                return num1 / num2;
            case '^' :
                int result = 0;
                result = num1;
                for (int i = 1; i < num2; i++) {
                    result *= num1;
                }
                return result;
            case '%' :
                return num1 % num2;
        }
        return 0;
    }

    private void parseExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        num1 = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        num2 = Integer.parseInt(partsExpression[2]);
    }
}