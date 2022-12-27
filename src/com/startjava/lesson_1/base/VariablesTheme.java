package com.startjava.lesson_1.base;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte ram = 32;
        System.out.println("Кол-во оперативной памяти: " + ram);
        short ramFrequency = 3200;
        System.out.println("Частота оперативной памяти: " + ramFrequency + " MHz");
        int cpuFrequency = 3800;
        System.out.println("Частота процессора: " + cpuFrequency + " MHz");
        long cpuNumberCores = 8;
        System.out.println("Кол-во ядер процессора: " + cpuNumberCores);
        float numberPi = 3.1415f;
        System.out.println("Число Пи: " + numberPi);
        double osVersion = 19044.2006;
        System.out.println("Версия ОС: " + osVersion);
        char northDesignation = 'N';
        System.out.println("Север на компасе обозначается буквой: " + northDesignation);
        boolean abscissa = true;
        System.out.println("Ось абсцисс обозначается буквой X? " + abscissa);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        float discount = 0.11f;
        float sumDiscount = (pricePen + priceBook) * discount;
        float discountPrice = (pricePen + priceBook) - sumDiscount;
        System.out.println("Стоимость ручки: " + pricePen);
        System.out.println("Стоимость книги: " + priceBook);
        System.out.println("Скидка: 11%");
        System.out.println("Сумма скидки = " + sumDiscount + " руб.");
        System.out.println("Общая стоимость товара со скидкой = " + discountPrice + " руб.");

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a\n");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        System.out.println("Тип byte");
        System.out.println("Первоначальное значение: " + byteMax);
        System.out.println("Значение после инкремента: " + ++byteMax);
        System.out.println("Значение после декремента: " + --byteMax);
        System.out.println("Тип short");
        System.out.println("Первоначальное значение: " + shortMax);
        System.out.println("Значение после инкремента: " + ++shortMax);
        System.out.println("Значение после декремента: " + --shortMax);
        System.out.println("Тип int");
        System.out.println("Первоначальное значение: " + intMax);
        System.out.println("Значение после инкремента: " + ++intMax);
        System.out.println("Значение после декремента: " + --intMax);
        System.out.println("Тип long");
        System.out.println("Первоначальное значение: " + longMax);
        System.out.println("Значение после инкремента: " + ++longMax);
        System.out.println("Значение после декремента: " + --longMax);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int buffer = 0;
        System.out.println("Перестановка значений с помощью третей переменной");
        System.out.println("Значение 1: " + num1);
        System.out.println("Значение 2: " + num2);
        buffer = num2;
        num2 = num1;
        num1 = buffer;
        System.out.println("Новое значение 1: " + num1);
        System.out.println("Новое значение 2: " + num2);
        System.out.println("Перестановка значений с помощью арифметических операций");
        System.out.println("Значение 1: " + num1);
        System.out.println("Значение 2: " + num2);
        buffer = num1 + num2;
        num2 = buffer - num2;
        num1 = buffer - num1;
        System.out.println("Новое значение 1: " + num1);
        System.out.println("Новое значение 2: " + num2);
        System.out.println("Перестановка значений с помощью побитовой операции");
        System.out.println("Значение 1: " + num1);
        System.out.println("Значение 2: " + num2);
        buffer = num2 ^ num1;
        num2 ^= buffer;
        num1 ^= buffer;
        System.out.println("Новое значение 1: " + num1);
        System.out.println("Новое значение 2: " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char code35 = '#';
        char code38 = '&';
        char code64 = '@';
        char code94 = '^';
        char code95 = '_';
        System.out.println("35 - " + code35);
        System.out.println("38 - " + code38);
        System.out.println("64 - " + code64);
        System.out.println("94 - " + code94);
        System.out.println("95 - " + code95);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int srcNumber = 356;
        int hundreds = srcNumber / 100;
        int dozens = srcNumber % 100 / 10;
        int ones = srcNumber % 10;
        System.out.println("Число " + srcNumber + " содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(dozens + " десятков");
        System.out.println(ones + " единиц");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char slesh = '/';
        char backslash = '\\'; 
        char underline = '_';
        char openBracket = '(';
        char closeBracket = ')';
        char space = ' ';
        System.out.printf("%c%c%c%c%c%c\n", space, space, space, space, slesh, backslash);
        System.out.printf("%c%c%c%c%c%c%c\n", space, space, space, slesh, space, space, backslash);
        System.out.printf("%c%c%c%c%c%c%c%c\n", space, space, slesh, underline, openBracket, space, 
                closeBracket, backslash);
        System.out.printf("%c%c%c%c%c%c%c%c%c\n", space, slesh, space, space, space, space, space, 
                space, backslash);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", slesh, underline, underline, underline,
                underline, slesh, backslash, underline, underline, backslash);

        System.out.println("\n9. Произведение и сумма цифр числа");
        int srcNumber3 = 345;
        int hundreds2 = srcNumber / 100;
        int dozens2 = srcNumber % 100 / 10;
        int ones2 = srcNumber % 10;
        int sum = hundreds2 + dozens2 + ones2;
        int prod = hundreds2 * dozens2 * ones2;
        System.out.println("Сумма цифр числа " + srcNumber + " = " + sum);
        System.out.println("Произведение цифр числа " + srcNumber + " = " + prod + "\n");

        System.out.println("10. Преобразование секунд");
        int allSecond = 86399;
        int hour = allSecond / 3600;
        int minute = allSecond % 3600 / 60;
        int second = allSecond % 60;
        System.out.println(allSecond + " секунд = " + hour + ":" + minute + ":" + second + "\n");
    }
}