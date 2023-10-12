package KI302.Telishevskyi.Lab5;
import java.io.*;
public class Lab5writerReader {
    // Метод для запису результату у текстовий файл у поточну директорію
    public static void writeResultToTextFile(double x, String filename) {
        String filePath = new File(filename).getAbsolutePath();
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            double result = Lab5.solveEquation(x);
            writer.println("Результат для x = " + x + ": " + result);
        } catch (IOException | ArithmeticException e) {
            e.printStackTrace();
        }
    }

    // Метод для запису результату у двійковий файл у поточну директорію
    public static void writeResultToBinaryFile(double x, String filename) {
        String filePath = new File(filename).getAbsolutePath();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            double result = Lab5.solveEquation(x);
            dos.writeDouble(result);
        } catch (IOException | ArithmeticException e) {
            e.printStackTrace();
        }
    }

    // Метод для читання результату з текстового файлу
    public static void readResultFromTextFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Метод для читання результату з двійкового файлу
    public static void readResultFromBinaryFile(String filename) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            double result = dis.readDouble();
            System.out.println("Результат з файлу: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        double x = 6.0;
        String textFilename = "result.txt";
        String binaryFilename = "result.dat";

        // Запис результату у текстовий файл
        writeResultToTextFile(x, textFilename);

        // Запис результату у двійковий файл
        writeResultToBinaryFile(x, binaryFilename);

        // Читання результату з текстового файлу
        readResultFromTextFile(textFilename);

        // Читання результату з двійкового файлу
        readResultFromBinaryFile(binaryFilename);
    }
}
