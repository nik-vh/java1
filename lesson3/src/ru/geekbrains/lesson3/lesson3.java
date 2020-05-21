package ru.geekbrains.lesson3;

import java.util.Scanner;

public class lesson3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Ваша задача угадать число от 0 до 9.");
        int range = 9;
        if(guessNumber(range)){
            System.out.println("Победа!!!");
        } else {
            System.out.println("Вы проиграли");
        }
    }

    public static boolean guessNumber(int range) {
        int number = (int)(Math.random()*range);
        boolean result = false;
        for(int i = 0; i < 3; i++) {
            System.out.println("Введите число:");
            int inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.println("Вы угадали");
                result = true;
                break;
            } else if (inputNumber > number) {
                System.out.println("Загадонное число меньше");
            } else {
                System.out.println("Загадонное число больше");
            }
        }
        return result;
    }
}
