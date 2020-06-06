package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    public static Scanner inputUser = new Scanner(System.in);
    public static Random inputAI = new Random();
    public static char[][] gameMap;
    public static final byte SIZE = 5;
    public static final byte DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initGameMap();
        printGameMap();

        while (true) {
            humanTurn();
            printGameMap();
            if (checkWinOffset(DOT_X, 0, 0) || checkWinOffset(DOT_X, 1, 0) ||
                    checkWinOffset(DOT_X, 0, 1) || checkWinOffset(DOT_X, 1, 1)) {
                System.out.println("Вы победили!!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }
            aiTurn();
            printGameMap();
            if (checkWinOffset(DOT_O, 0, 0) || checkWinOffset(DOT_O, 1, 0) ||
                    checkWinOffset(DOT_O, 0, 1) || checkWinOffset(DOT_O, 1, 1)) {
                System.out.println("Компьютер победил...");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }
        }
    }

    public static void initGameMap() {
        gameMap = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                gameMap[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printGameMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты вашего хода:");
            System.out.print("x: ");
            x = inputUser.nextInt() - 1;
            System.out.println();
            System.out.print("y: ");
            y = inputUser.nextInt() - 1;
        } while (!isCellValid(x,y));
        gameMap[y][x] = DOT_X;
    }


    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (gameMap[y][x] == DOT_EMPTY) return true;
        return false;
    }


    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (gameMap[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = inputAI.nextInt(SIZE);
            y = inputAI.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        gameMap[y][x] = DOT_O;
    }

    public static boolean checkWinOffset(char symbol, int offsetX, int offsetY) {
        boolean cols, rows;
        boolean diagonalToRight = true;
        boolean diagonalToLeft = true;
        boolean vertical, horizontal;
        int jY = offsetY;
        for (int iX=offsetX; iX < DOTS_TO_WIN + offsetX; iX++) {

            diagonalToRight &= (gameMap[iX][jY] == symbol);
            diagonalToLeft &= (gameMap[5-iX-1][jY] == symbol);
            jY++;
        }

        if (diagonalToRight || diagonalToLeft) return true;

        for (int i = offsetX; i < DOTS_TO_WIN + offsetX; i++) {
            vertical = true;
            horizontal = true;
            for (int j = offsetY; j < DOTS_TO_WIN + offsetY; j++) {
                vertical &= (gameMap[i][j] == symbol);
                horizontal &= (gameMap[j][i] == symbol);
            }

            if (vertical || horizontal) return true;
        }

        return false;
    }

}
