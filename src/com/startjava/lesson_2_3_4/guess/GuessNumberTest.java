package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Игрок 1 введите имя: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Игрок 2 введите имя: ");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";

        while(!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no]");
            answer = scanner.nextLine();
        }
    }
}