package com.startjava.lesson_1.final1;

public class Calculator {

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        char sign = '*';
        int result = 0;

        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            result = num1;
            for (int i = 1; i < num2; i++ ) {
                result *= num1;
            }
        } else if (sign == '%') {
            result = num1 % num2;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}