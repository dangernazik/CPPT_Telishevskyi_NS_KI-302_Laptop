package KI302.Telishevskyi.Lab4;
import java.util.Scanner;

public class Lab4Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введіть значення x:");
            double x = scanner.nextDouble();

            double result = Lab4.solveEquation(x);
            System.out.println("Результат: y = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Сталася помилка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Сталася загальна помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}
