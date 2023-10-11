package KI302.Telishevskyi.Lab1;

import java.io.*;
import java.util.*;
public class Lab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір квадратної матриці: ");
        int n = scanner.nextInt();

        String filler;


        //ЗАПОВНЕННЯ МАТРИЦІ СИМВОЛОМ ЗАПОВНЮВАЧЕМ
        do {
            System.out.print("Введіть символ-заповнювач (символ довжиною 1): ");
            filler = scanner.next();
            if (filler.length() != 1) {
                System.out.println("Символ-заповнювач має бути лише одним символом.");
            }
        } while (filler.length() != 1);
        char fillerChar = filler.charAt(0);

        char[][] matrix = new char[n][n];


        //ЦИКЛ ПО РЯДКАХ МАТРИЦІ
        for (int i = 0; i < n; i++) {
        //ЦИКЛ ПО СТОВПЦЯХ МАТРИЦІ
            for (int j = 0; j < n; j++) {
                if (i <= j && i + j <= n - 1 || i >= j && i + j >= n - 1) {
                        matrix[i][j] = fillerChar;
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        try {
            //ІНІЦІАЛІЗАЦІЯ ОБЄКТА ДЛЯ СТВОРЕННЯ ФАЙЛУ
            FileWriter writer = new FileWriter("D:\\programming\\CPPT_Telishevskyi_NS_KI-302\\src\\KI302\\Telishevskyi\\Lab1\\matrix.txt");
            //ІНІЦІАЛІЗАЦІЯ ОБЄКТА ДЛЯ ЗАПИСУ У ФАЙЛ
            PrintWriter printWriter = new PrintWriter(writer);

            //ЦИКЛ ПО РЯДКАХ МАТРИЦІ
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    printWriter.print(matrix[i][j] + " ");
                    System.out.print(matrix[i][j] + " ");
                }
                printWriter.println();
                System.out.println();
            }

            //ЗАКРИТТЯ ОБЄКТУ ЗАПИСУ У ФАЙЛ
            printWriter.close();
            System.out.println("Матриця збережена у файлі 'matrix.txt'.");
        } catch (IOException e) {
            System.err.println("Помилка при збереженні матриці у файлі.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
