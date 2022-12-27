package com.startjava.lesson_1.base;

public class MyFirstApp {
    public static void main(String[] args) {

        // TODO: Суммировать цифри в диапазоне от 1 до 5

        // int sum = 1;

        // for (int i = 2; i < 6; i++) {    
        //  sum += i;
        //  if (sum % 2 == 0) {
        //      System.out.println("Число " + sum + " явялется четное");
        //  }else{
        //      System.out.println("Число " + sum + " является не четное");
        //  }
        // }
 
        // System.out.println("1 + 2 + 3 + 4 + 5 = " + sum);

        // int sum = 1;
        // int i = 2;

        // while(i < 6) {
        //  sum += i;
        //  if (sum % 2 == 0) {
        //      System.out.println("Число " + sum + " явялется четное");
        //  }else{
        //      System.out.println("Число " + sum + " является не четное");
        //  }
        //  i++;
        // }
        // System.out.println("1 + 2 + 3 + 4 + 5 = " + sum);

        int sum = 1;
        int i = 2;

        do {
            sum += i;
            if (sum % 2 == 0) {
                System.out.println("Число " + sum + " явялется четное");
            }else{
                System.out.println("Число " + sum + " является не четное");
            }
            i++;
        } while(i < 6);
        System.out.println("1 + 2 + 3 + 4 + 5 = " + sum);


    }
}