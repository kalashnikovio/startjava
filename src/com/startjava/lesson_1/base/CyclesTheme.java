package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNum = 0;
        int sumOddNum = 0;
        int numFrom = -10;
        int numTo = 21;
        do {
            if (numFrom % 2 == 0) {
                sumEvenNum += numFrom;
            } else {
                sumOddNum += numFrom;
            }
            numFrom++;
        } while(numFrom <= numTo);
        System.out.println("В промежутке (-10, 21] сумма четных чисел = " + sumEvenNum + 
                " , а нечетных = " + sumOddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int numMax = num2;
        int numMin = num1 ;
        System.out.println("Даны числа: " + num1 + " " + num2 + " " + num3);
        if (num1 > numMax) {
            numMax = num1;
        }
        if (num3 > numMax) {
            numMax = num3;
        }
        if (num2 < numMin) {
            numMin = num2;
        }
        if (num3 < numMin) {
            numMin = num3;
        }
        System.out.println("В промежутке (" + numMin + "," + " " + numMax + ")" + 
                " следующие числа(в порядке убывания):");
        for (int i = numMax - 1; i > numMin; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sumDigits = 0;
        System.out.println("Исходное число: " + srcNum);
        System.out.print("Исходное число в обратном порядке: ");
        while(srcNum > 0) {
            int digit = srcNum % 10;
            srcNum /= 10;
            sumDigits += digit;
            System.out.print(digit);
        }
        System.out.println("\nСумма цифр = " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int numFrom2 = 1;
        int numTo2 = 24;
        int numPerLine = 1;
        int numLines = 5;
        for (int j = numFrom2; j < numTo2; j += 2) {
            if (numPerLine > 5) {
                System.out.println();
                numPerLine = 1;
            } 
            System.out.printf("%4d", j);
            numPerLine++;
        }
        if (numPerLine < numLines) {
            for (int i = numPerLine; numPerLine <= numLines; i++) {
                System.out.printf("%4d", 0);
                numPerLine++;
            }
        }
        
        System.out.println("\n\n5. Проверка количества единиц на четность");
        int num4 = 3141591;
        int copyNum4 = num4;
        int countOnes = 0;
        while(copyNum4 != 0) {
            int digit = copyNum4 % 10;
            copyNum4 /= 10;
            if (digit == 1) {
                countOnes++;
            }
        }
        if (countOnes % 2 == 0) {
            System.out.println("Число " + num4 + " содержит " + countOnes + 
                    " (четное) количество единиц");
        } else {
            System.out.println("Число " + num4 + " содержит " + countOnes + 
                    " (нечетное) количество единиц");
        }
        
        System.out.println("\n6. Отображение фигур в консоли");
        for(int i = 0; i < 5; i++) { 
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int maxСolumn = 5;
        int column = 0;
        int maxLine = 6;
        int line = 0;
        while(maxLine > line) {
            column = 0;
            while(maxСolumn > column) {
                System.out.print("#");
                column++;
            }
            System.out.println();
            line++;
            maxСolumn--;
        }

        line = 1;
        maxLine = 1;
        column = 0;
        do {
            column = 0;
            do {
                System.out.print("&");
                column++;
            } while(line > column);
            System.out.println();
            if (maxLine < 3) {
                line++;
            } else {
                line--;
            }
            maxLine++;
        } while(maxLine < 6);
        
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%6s%6s%n", "Dec", "Char");
        for (int i = 1; i < 123; i++) {
            if (i >= 48 && i <= 96) {
                continue;
            } else if (i % 2 == 0) {
                if (i >= 'a' && i <= 'z') {
                    System.out.printf("%5d%5c%n", i, i);
                }
            } else if (i <= 97) {
                System.out.printf("%5d%5c%n", i, i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        int copySrcNum = srcNum;
        int reverse = 0;
        while(copySrcNum > 0){
            int digit = copySrcNum % 10;
            reverse = reverse * 10 + digit;
            copySrcNum /= 10;
        }
        if (srcNum == reverse) {
            System.out.println("Число " + srcNum + " является палиндромом");
        } else {
            System.out.println("Число " + srcNum + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 123123;
        int sumFirstNum = 0;
        int sumLastNum = 0;
        column = 1;
        String strNum1 = "";
        String strNum2 = "";
        System.out.println("Число: " + srcNum );
        while(srcNum != 0) {
            if (column <= 3) {
                strNum1 += srcNum % 10;
                sumLastNum += srcNum % 10;
            } else {
                strNum2 += srcNum % 10;
                sumFirstNum += srcNum % 10;
            }
            srcNum /= 10;
            column++;
        }
        System.out.printf("%s%5s%2s%3d\n", "Сумма цифр", strNum1, "=", sumLastNum);
        System.out.printf("%s%5s%2s%3d\n", "Сумма цифр", strNum2, "=", sumLastNum);
        if (sumLastNum == sumFirstNum) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число не счастливое");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.printf("   |");
        for(int i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.printf("\n---|------------------------\n");
        for(int i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for(int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
                System.out.println();
        }
    }
}
