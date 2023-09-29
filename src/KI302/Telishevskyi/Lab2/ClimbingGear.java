package KI302.Telishevskyi.Lab2;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClimbingGear {
    //Поля класу
    private Shoes shoes;
    private Clothes clothes;
    private Rope rope;

    // Поле для запису протоколу
    private PrintWriter logWriter;

    //Пустий конструктор без аргументів
    public ClimbingGear(){
        try {
            logWriter = new PrintWriter(new FileWriter("D:\\programming\\CPPT_Telishevskyi_NS_KI-302\\src\\KI302\\Telishevskyi\\Lab2\\climbing_log.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Конструктор з усіма аргументами
    public ClimbingGear(Shoes shoes, Clothes clothes, Rope rope){
        this.shoes = shoes;
        this.clothes = clothes;
        this.rope = rope;
        try {
            logWriter = new PrintWriter(new FileWriter("D:\\programming\\CPPT_Telishevskyi_NS_KI-302\\src\\KI302\\Telishevskyi\\Lab2\\climbing_log.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Гетери і Сетери для обєктів класу
    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public Rope getRope() {
        return rope;
    }

    public void setRope(Rope rope) {
        this.rope = rope;
    }

    private void logActivity(String activity) {
        if (logWriter != null) {
            logWriter.println(activity);
            logWriter.flush();
        }
    }

    // Методи для роботи зі спорядженням

    public void putOnShoes() {
        System.out.println("Putting on climbing shoes.");
        logActivity("Put on climbing shoes."); // Запис у протокол
    }

    public void wearClothes() {
        System.out.println("Wearing climbing clothes.");
        logActivity("We wear climbing clothes."); // Запис у протокол
    }

    public void tieRope() {
        System.out.println("Tying the climbing rope.");
        logActivity("Climbing ropes were tied."); // Запис у протокол
    }

    public void checkGear() {
        System.out.println("Checking climbing gear.");
        logActivity("Climbing gear were checked."); // Запис у протокол
    }

    public void startClimbing() {
        System.out.println("Starting the climb.");
        logActivity("We started the climb"); // Запис у протокол
    }

    public void descend() {
        System.out.println("Descending from the climbing route.");
        logActivity("Descended from the climbing route"); // Запис у протокол
    }

    public void takeRest() {
        System.out.println("Taking a rest during the climb.");
        logActivity("Took the rest/"); // Запис у протокол
    }

    public void sendSignal() {
        System.out.println("Sending a signal in case of emergency.");
        logActivity("We sent signal in case of emergency."); // Запис у протокол
    }

    public void packGear() {
        System.out.println("Packing climbing gear after the climb.");
        logActivity("We packed the climbing gear."); // Запис у протокол
        closeLogFile(); // Закриваємо файл при завершенні роботи
    }

    // Метод для закриття файлу протоколу
    private void closeLogFile() {
        if (logWriter != null) {
            logWriter.close();
        }
    }
    //Метод toString()
    @Override
    public String toString() {
        return "ClimbingGear: Shoes - " + shoes + ", Clothes - " + clothes + ", Rope - " + rope;
    }

}
