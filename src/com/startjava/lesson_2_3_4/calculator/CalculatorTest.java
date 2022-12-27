package com.startjava.lesson_2_3_4.calculator;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        while(!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение:");
                String expression = scanner.nextLine();
                int result = calculator.calculate(expression);
                System.out.println(expression + " = " + result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
        }
    }
}