package ru.geekbrains.lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lesson2 {
    public static void main(String[] args){
        //Задание №1
        System.out.println("Задание №1");
        int[] arrayTask1 = {1,1,0,0,1,0,1,1,0,0};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arrayTask1));
        zeroOneChange(arrayTask1);
        System.out.println("Измененный массив:");
        System.out.println(Arrays.toString(arrayTask1));

        //Задание №2
        System.out.println("============================================");
        System.out.println("Задание №2");
        int[] arrayTask2 = new int[8];
        System.out.println("Заполняем массив:");
        writeInArray(arrayTask2);
        System.out.println(Arrays.toString(arrayTask2));

        //Задание №3
        System.out.println("============================================");
        System.out.println("Задание №3");
        int[] arrayTask3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arrayTask3));
        ifMore6MultiplyBy2(arrayTask3);
        System.out.println("Измененный массив:");
        System.out.println(Arrays.toString(arrayTask3));

        //Задание №4
        System.out.println("============================================");
        System.out.println("Задание №4");
        int[][] arrayTask4 = new int[8][8];
        oneToDiagonal(arrayTask4);
        print2DArray(arrayTask4);
    }

    public static void zeroOneChange(int[] sourceArray){
        for(int i = 0; i < sourceArray.length; i++)
            if (sourceArray[i] == 1) sourceArray[i] = 0;
            else sourceArray[i] = 1;
    }

    public static void writeInArray(int[] sourceArray){
        for(int i = 0; i < sourceArray.length; i++) sourceArray[i] = i * 3;
    }

    public static void ifMore6MultiplyBy2(int[] sourceArray){
        for(int i = 0; i < sourceArray.length; i++) if (sourceArray[i] < 6) sourceArray[i] *= 2;
    }

    public static void oneToDiagonal(int[][] sourceArray){
        for(int i = 0; i < sourceArray.length; i++){
            sourceArray[i][i] = 1;
            sourceArray[i][sourceArray[i].length - 1 - i] = 1;
        }
    }

    public static void print2DArray(int[][] sourceArray){
        for (int i = 0; i < sourceArray.length; i++){
            System.out.println(Arrays.toString(sourceArray[i]));
        }
    }
}
