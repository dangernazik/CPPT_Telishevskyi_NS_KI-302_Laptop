package KI302.Telishevskyi.Lab2;

public class Shoes {
    //Поле класу
    private String brand;
    //Конструктор без аргументів
    public Shoes(){

    }
    //Конструктор з усіма аргументами
    public Shoes(String brand){
        this.brand = brand;
    }
    //Метод toString()
    @Override
    public String toString() {
        return "Shoes{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
