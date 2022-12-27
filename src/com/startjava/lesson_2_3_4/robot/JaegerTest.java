package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        System.out.println("Робот 1: ");
        Jaeger jaeger1 = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1850f, 8, 6);
        System.out.println("Model Name: " + jaeger1.getModelName());
        System.out.println("Mark: " + jaeger1.getMark());
        System.out.println("Origin: " + jaeger1.getOrigin());
        System.out.println("Height: " + jaeger1.getHeight());
        System.out.println("Weight: " + jaeger1.getWeight());
        System.out.println("Strength: " + jaeger1.getStrength());
        System.out.println("Armor: " + jaeger1.getArmor());

        System.out.println("\nРобот 2: ");
        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Gipsy Danger");
        jaeger2.setMark("Mark-3");
        jaeger2.setOrigin("United States of America");
        jaeger2.setHeight(76.2f);
        jaeger2.setWeight(1980f);
        jaeger2.setStrength(8);
        jaeger2.setArmor(6);

        System.out.println("Model Name: " + jaeger2.getModelName());
        System.out.println("Mark: " + jaeger2.getMark());
        System.out.println("Origin: " + jaeger2.getOrigin());
        System.out.println("Height: " + jaeger2.getHeight());
        System.out.println("Weight: " + jaeger2.getWeight());
        System.out.println("Strength: " + jaeger2.getStrength());
        System.out.println("Armor: " + jaeger2.getArmor());

        System.out.println("\nОбщие характеристики: ");
        if (jaeger1.getHeight() == jaeger2.getHeight()) {
            System.out.println("У роботов характеристика Height равны");
        }
        if (jaeger1.getWeight() == jaeger2.getWeight()) {
            System.out.println("У роботов характеристика Weight равны");
        }
        if (jaeger1.getStrength() == jaeger2.getStrength()) {
            System.out.println("У роботов характеристика Strength равны");
        }
        if (jaeger1.getArmor() == jaeger2.getArmor()) {
            System.out.println("У роботов характеристика Armor равны");
        }
    }
}