package com.startjava.lesson_1.final1;

public class GuessNumber {

    public static void main(String[] args) {
        int hidNum = 55;
        int playerNum = 70;

        while (playerNum != hidNum) {
            if (playerNum > hidNum) {
                System.out.println("Число " + playerNum + " больше " + hidNum + ", что загадал компьютер");
                playerNum--;
            } else if (playerNum < hidNum) {
                playerNum++;
                System.out.println("Число " + playerNum + " меньше " + hidNum + ", что загадал компьютер");
            }
        }
        System.out.println("Вы победили! Загаданное число: " + playerNum);
    }
}