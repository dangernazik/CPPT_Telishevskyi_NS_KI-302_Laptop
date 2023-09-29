package KI302.Telishevskyi.Lab1;

import java.io.*;
import java.util.*;
public class Lab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір квадратної матриці: ");
        int n = scanner.nextInt();

        String filler;
        do {
            System.out.print("Введіть символ-заповнювач (символ довжиною 1): ");
            filler = scanner.next();
            if (filler.length() != 1) {
                System.out.println("Символ-заповнювач має бути лише одним символом.");
            }
        } while (filler.length() != 1);
        char fillerChar = filler.charAt(0);

        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j && i + j >= n - 1 || i <= j && i + j <= n - 1) {
                    matrix[i][j] = fillerChar;
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        try {
            FileWriter writer = new FileWriter("matrix.txt");
            PrintWriter printWriter = new PrintWriter(writer);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    printWriter.print(matrix[i][j] + " ");
                    System.out.print(matrix[i][j] + " ");
                }
                printWriter.println();
                System.out.println();
            }

            printWriter.close();
            System.out.println("Матриця збережена у файлі 'matrix.txt'.");
        } catch (IOException e) {
            System.err.println("Помилка при збереженні матриці у файлі.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
