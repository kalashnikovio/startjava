package com.startjava.lesson_2_3_4.animal;

public class Wolf {

    private String gender;
    private String nickname;
    private int weight;
    private int age;
    private String color;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String move() {
        return "идет";
    }

    public String sit() {
        return "сидит";
    }

    public String run() {
        return "бежит";
    }

    public String howl() {
        return "воет";
    }

    public String hunt() {
        return "охотится";
    }
}