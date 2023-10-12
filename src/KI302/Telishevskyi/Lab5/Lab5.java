package KI302.Telishevskyi.Lab5;

public class Lab5 {
    public static double solveEquation(double x) throws ArithmeticException {
        double numerator = Math.sin(x - 9);
        double denominator = x - Math.cos(2 * x);

        if (Math.abs(denominator) < 1e-6) {
            throw new ArithmeticException("Дільник став дуже близьким до нуля. Розв'язок не знайдено.");
        }

        return numerator / denominator;
    }
}
