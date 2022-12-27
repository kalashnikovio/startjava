package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

     private int hiddenNum;
     private Player player1;
     private Player player2;

     public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
     }

     public void start() {
        thinkNum();
        initAttempts();
        System.out.println("У каждого игрока по 10 попыток");
        while (true) {
            if (isGuessed(player1) || isGuessed(player2)) {
                break;
            }
            if (player1.getAttempNum() == 10 && player2.getAttempNum() == 10) {
                System.out.println("У игроков закончились попытки");
                break;
            }
        }
        outEnteredNums(player1);
        outEnteredNums(player2);
    }

     private void thinkNum() {
        hiddenNum = ((int) (1 + Math.random() * 100));
        System.out.println("Загадано число от 0 по 100, угадайте число");
     }

    private void initAttempts() {
        player1.clearAttemts();
        player2.clearAttemts();
    }

     private boolean isGuessed(Player player) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Игрок " + player.getName() + " введите число: ");
         player.addEnteredNum((scanner.nextInt()));

         int enteredNum = player.getLastEnteredNum();
         if (enteredNum == hiddenNum) {
             System.out.println("Игрок " + player.getName() + " угадал число: " + hiddenNum + " c " +
                    player.getAttempNum() + " попытки");
             return true;
        }
        if (enteredNum > hiddenNum) {
            System.out.println("Число " + enteredNum + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + enteredNum + " меньше того, что загадал компьютер");
        }
        if (player.getAttempNum() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    public void outEnteredNums(Player player) {
        System.out.print("Игрок " + player.getName() + " вводил числа: ");
        int[] numsOut = player.getEnteredNums();
        for (int num : numsOut) {
            System.out.printf("%1d %s", num, " ");
        }
        System.out.println();
    }
}