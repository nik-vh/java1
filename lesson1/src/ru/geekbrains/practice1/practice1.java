package ru.geekbrains.practice1;

public class practice1 {
    public static void main(String[] args){
        byte theByte = -128;
        short theShort = 32767;
        int theInt = -2000000;
        long theLong = 9000000000000L;
        float theFloat = 13.4866f;
        double theDouble = -123.933399993;
        char theChar = '%';
        boolean theBoolean = true;
    }

    public static int mathFormula(int a, int b, int c, int d){

        return a * (b + (c / d));
    }

    public static boolean moreThen10andLessThan20(int a, int b){
        boolean c;
        int d = a + b;
        c = d >= 10 && d <= 20;
        return c;
    }

    public static void positiveOrNegative(int a){
        if(a >= 0){
            System.out.println("Вы передали положительное число!");
        } else {
            System.out.println("Вы передали отрицательное число");
        }
    }

    public static boolean onlyNegative(int a){
        return a < 0;
    }

    public static void namePut(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void leapYear(int a){
        if ((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0))){
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год не високосный!");
        }
    }
}