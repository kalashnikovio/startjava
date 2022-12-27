package com.startjava.lesson_2_3_4.person;

public class Person {

    String gender = "Мужской";
    String name = "Игорь";
    int height = 187;
    int weight  = 67;
    int age = 24;

    void move() {
        System.out.println("Вы прошли 4 шага");
    }

    void sit() {
        System.out.println("Вы сидите");
    }

    void run() {
        System.out.println("Вы бежите");
    }

    void talk() {
        System.out.println("Вы говорите");
    }
    
    String learnJava() {
        return "Вы учите Java";
    }
}