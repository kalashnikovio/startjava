package com.startjava.lesson_2_3_4.array;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {4, 3, 7, 1, 2, 6, 5};

        System.out.println("Начальный массив");
        outArrayInt(intArr);
        int length = intArr.length;
        for (int i = 0; i < length; i++) {
            length--;
            int num = intArr[i];
            intArr[i] = intArr[length];
            intArr[length] = num;
        }

        System.out.println("\nРеверс массива");
        outArrayInt(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        length = intArr.length;
        for (int i = 0; i < length; i++) {
            intArr[i] = i;
        }
        int multDigits = 1;
        for (int i = 1; i <= length - 1; i++) {
            if (i < length - 1) {
                multDigits *= intArr[i];
            }
            System.out.print((i != length - 1) ?  intArr[i]  + " * " : " = " + multDigits  );
        }
        System.out.println("\nЧисло " + intArr[0] + " индекс = 0");
        System.out.println("Число " + intArr[9] + " индекс = 9");

        System.out.println("\n3. Удаление элементов массива");

        float[] floatArr = new float[15];
        length = floatArr.length;
        for (int i = 0; i < length; i++) {
            floatArr[i] = ((float) (Math.random()));
        }
        System.out.println("Исходный массив");
        outArrayFloatMultiLine(floatArr);
        float middleNum = floatArr[floatArr.length / 2];
        int countZeroed = 0;
        for (int i = 0; i < length; i++) {
            if (floatArr[i] > middleNum) {
                floatArr[i] = 0;
                countZeroed++;
            }
        }
        System.out.println("\nИзмененный массив");
        outArrayFloatMultiLine(floatArr);
        System.out.println("\nКол-во обнуленных ячеек: " + countZeroed);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        length = alphabet.length;
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.print("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        length = intArr.length;
        for (int i = 0; i < length; i++) {
            boolean unique = true;
            int num = ((int) (60 + Math.random() * 40));
            for (int j = 0; j < length; j++) {
                if (intArr[j] == num) {
                    unique = false;
                    i--;
                    break;
                }
            }
            if (unique) {
                intArr[i] = num;
            }
        }
        Arrays.sort(intArr);
        outArrayIntMultiLine(intArr);
    }

    private static void outArrayInt(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void outArrayFloatMultiLine(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f ", array[i]);
            if (i == 7) {
                System.out.println();
            }
        }
    }

    private  static  void outArrayIntMultiLine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print((i % 10 != 0 ) ? " " : "\n");
            System.out.print(array[i]);
        }
    }
}

