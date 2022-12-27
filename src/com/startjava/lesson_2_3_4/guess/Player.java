package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempNum;
    private int[] enteredNums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempNum() {
        return attempNum;
    }

    public void addEnteredNum(int enteredNum) {
        enteredNums[attempNum] = enteredNum;
        attempNum++;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, attempNum);
    }

    public void clearAttemts() {
        Arrays.fill(enteredNums, 0, attempNum,  0);
        attempNum = 0;
    }

    public int getLastEnteredNum() {
        return enteredNums[attempNum - 1];
    }
}