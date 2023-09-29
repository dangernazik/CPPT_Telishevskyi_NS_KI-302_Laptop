package KI302.Telishevskyi.Lab2;

public class Clothes {
    //Поля класу
    private String pants;
    private String jacket;
    //Конструктор без аргументів
    public Clothes(){

    }
    //Конструктор з усіма аргументами
    public Clothes(String pants, String jacket){
        this.pants = pants;
        this.jacket = jacket;
    }
    //Метод toString()
    @Override
    public String toString() {
        return "Clothes{" +
                "pants='" + pants + '\'' +
                ", jacket='" + jacket + '\'' +
                '}';
    }
}
