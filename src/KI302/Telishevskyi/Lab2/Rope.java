package KI302.Telishevskyi.Lab2;

public class Rope {
    //Поле класу
    private int metres;
    //Конструктор без аргументів
    public Rope(){

    }
    //Конструктор з усіма аргументами
    public Rope(int metres){

        this.metres = metres;
    }
    //Метод toString()
    @Override
    public String toString() {
        return "Rope{" +
                "metres=" + metres +
                '}';
    }
}