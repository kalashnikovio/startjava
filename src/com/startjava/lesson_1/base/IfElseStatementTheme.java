package com.startjava.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 19;
        boolean maleGender = true;
        double height = 1.87;
        char firstLaterName = "Igor".charAt(0);

        if (age > 20) {
            System.out.println("Вам больше 20 лет");
        } else {
            System.out.println("Вам меньше 20 лет");
        }

        if (!maleGender) {
            System.out.println("Ваш пол женский");
        } else {
            System.out.println("Ваш пол мужской");
        }

        if (height < 1.80) {
            System.out.println("Вам рост ниже 180 сантиметров");
        } else {
            System.out.println("Вам рост выше 180 сантиметров");
        }

        if (firstLaterName == 'M') {
            System.out.println("Первая буква вашего имени " + firstLaterName);
        } else if (firstLaterName == 'I') {
            System.out.println("Первая буква вашего имени " + firstLaterName);
        } else {
            System.out.println("Мы не знаем первую букву вашего имени(");
        }
        
        System.out.println("\n2. Поиск max и min числа");
        int num1 = 120;
        int num2 = 120;

        System.out.println("Первое число: " + num1);
        System.out.println("Второе число: " + num2);

        if (num1 > num2) {
            System.out.println("Число " + num1 + " больше числа " + num2);
        } else if (num1 < num2) {
            System.out.println("Число " + num2 + " больше числа " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Работа с числом");
        int num3 = -122;

        System.out.println("Исходное число " + num3);
        if (num3 == 0) {
            System.out.println("Число равно нулю");
        } else {
            if (num3 % 2 == 0) {
                System.out.print("Число четное"); 
            } else {
                System.out.print("Число нечетное");   
            }
            if (num3 < 0) {
                System.out.println(" и отрицательное");  
            } else {
                System.out.println(" и положительное");  
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");  
        int  srcNum1 = 321;
        int srcNum2 = 321;

        System.out.println("Число 1 = " +  srcNum1 + "\n" + "Число 2 = " + srcNum2);
        int hundreds1 =  srcNum1 / 100;
        int dozens1 =  srcNum1 % 100 / 10;
        int ones1 =  srcNum1 % 10;
        int hundreds2 = srcNum2 / 100;
        int dozens2 = srcNum2 % 100 / 10;
        int ones2 = srcNum2 % 10;
        if (hundreds1 == hundreds2) {
            System.out.println("Сотни у чисел равны " + hundreds1);
        }
        if (dozens1 == dozens2) {
            System.out.println("Десятки у чисел равны " + dozens2);
        }
        if (ones1 == ones2) {
            System.out.println("Единицы у чисел равны " + ones1);
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char numCode = '\u0057';
        System.out.println("Задано значение: " + numCode);
        if (numCode >= '0' && numCode <= '9') {
            System.out.println("Это число");
        } else if (numCode >= 'a' && numCode <= 'z') {
            System.out.println("Это маленькая буква"); 
        } else if (numCode >= 'A' && numCode <= 'Z') {
            System.out.println("Это заглавная буква"); 
        } else {
            System.out.println("Это не буква и не число"); 
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        float amountDeposit = 300000f;
        float accruedInterest = 0;
        System.out.println("Сумма вклада = " + amountDeposit);
        if (amountDeposit < 100000) {
            accruedInterest = amountDeposit * 0.05f;
        } else if (amountDeposit >= 100000 && amountDeposit < 300000) {
            accruedInterest = amountDeposit * 0.07f;
        } else if (amountDeposit >= 300000) {
            accruedInterest = amountDeposit * 0.1f;
        }
        float grandTotal = amountDeposit + accruedInterest;
        System.out.println("Начисленный % = " + accruedInterest);
        System.out.println("Итоговая сумма = " + grandTotal);

        System.out.println("\n7. Определение оценки по предметам");
        int finalPercentHistory = 59;
        int finalPercentProgramming = 91;
        int gradeHistory = 0;
        int gradeProgramming = 0;
        if (finalPercentHistory <= 60) {
            gradeHistory = 2;
        } else if (finalPercentHistory > 60 && finalPercentHistory <= 73) {
            gradeHistory = 3;
        } else if (finalPercentHistory > 73 && finalPercentHistory <= 91) {
            gradeHistory = 4;
        } else if (finalPercentHistory > 91) {
            gradeHistory = 5;
        }
        if (finalPercentProgramming <= 60) {
            gradeProgramming = 2;
        } else if (finalPercentProgramming > 60 && finalPercentProgramming <= 73) {
            gradeProgramming = 3;
        } else if (finalPercentProgramming > 73 && finalPercentProgramming <= 91) {
            gradeProgramming = 4;
        } else if (finalPercentProgramming > 91) {
            gradeProgramming = 5;
        }
        float gpaGrade = (gradeHistory + gradeProgramming) / 2f;
        float gpaPercent = (finalPercentHistory + finalPercentProgramming) / 2f;
        System.out.println("Оценка по истории: " + gradeHistory);
        System.out.println("Оценка по программированию: " + gradeProgramming);
        System.out.println("Средний балл по предметам: " + gpaGrade);
        System.out.println("Средний % по предметам: " + gpaPercent + "%");

        System.out.println("\n8. Расчет прибыли");
        int roomRental = 5000;
        int incomemMonth = 13000;
        int costPrice = 9000;
        int profitYear = ((incomemMonth - costPrice) - roomRental) * 12;
        if (profitYear > 0) {
            System.out.println("Прибыль за год +" + profitYear);
        } else {
            System.out.println("Прибыль за год " + profitYear);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int needAmount = 567;
        int hundreds3 = needAmount / 100;
        int dozens3 = needAmount % 100 / 10;
        int ones3 = needAmount % 10;
        int amountBanknotesAvailable = 5;
        System.out.println("Необходимо снять " + needAmount);
        if (dozens3 > amountBanknotesAvailable) {
            int difference = (dozens3 - amountBanknotesAvailable) * 10;
            ones3 += difference;
            dozens3 = amountBanknotesAvailable;
        }
        int checkingBanknotes = (hundreds3 * 100) + (dozens3 * 10) + ones3;
        if (checkingBanknotes == needAmount) {
            System.out.println("Банкнот номиналом 1 необходимо: " + ones3);
            System.out.println("Банкнот номиналом 10 необходимо: " + dozens3);
            System.out.println("Банкнот номиналом 100 необходимо: " + hundreds3);
        } else {
            System.out.println("Кол-во банкнот посчитано не верно!");
        }
    }
}