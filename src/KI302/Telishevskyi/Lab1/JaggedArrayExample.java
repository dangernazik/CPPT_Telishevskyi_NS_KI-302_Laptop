package KI302.Telishevskyi.Lab1;

import java.util.ArrayList;
import java.util.List;

public class JaggedArrayExample {
    public static void main(String[] args) {
        int n = 5; // Змініть розмір матриці за потребою
        char fillerChar = '*';

        // Створення зубчастого масиву
        List<List<Character>> matrix = new ArrayList<>();

        // Заповнення зубчастого масиву
        for (int i = 0; i < n; i++) {
            List<Character> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (i >= j && i + j >= n - 1 || i <= j && i + j <= n - 1) {
                    row.add(fillerChar);
                } else {
                    row.add(' ');
                }
            }
            matrix.add(row);
        }

        // Виведення зубчастого масиву на екран
        for (List<Character> row : matrix) {
            for (Character element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

