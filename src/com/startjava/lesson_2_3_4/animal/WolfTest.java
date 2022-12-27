package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("Мужской");
        wolf.setNickname("Кирилл");
        wolf.setWeight(15);
        wolf.setAge(8);
        wolf.setColor("Серый");

        System.out.println("Пол волка: " + wolf.getGender());
        System.out.println("Кличка волка: " + wolf.getNickname());
        System.out.println("Вес волка: " + wolf.getWeight());
        System.out.println("Возраст волка: " + wolf.getAge());
        System.out.println("Цвет волка: " + wolf.getColor());
        System.out.println("Волк " + wolf.move() + " " + wolf.hunt());
        System.out.println("Волк " + wolf.sit() + " и " + wolf.howl());
        System.out.println("Волк " + wolf.run());
    }
}