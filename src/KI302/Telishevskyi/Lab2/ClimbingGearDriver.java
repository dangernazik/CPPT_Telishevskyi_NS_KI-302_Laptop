package KI302.Telishevskyi.Lab2;

public class ClimbingGearDriver {
    //Головний метод
    public static void main(String[] args) {
        //Ініціалізація полів
        Shoes shoes = new Shoes("Saucony");
        Clothes clothes = new Clothes("CMP Man Long Pants", "CMP Man Jacket");
        Rope rope = new Rope(125);

        //Зміна полів за допомогою метода Сет і відображення зміненого за допомогою метода Гет
        ClimbingGear gear = new ClimbingGear(shoes, clothes, rope);
        System.out.println(gear);

        gear.setRope(new Rope(634));
        System.out.println(gear.getRope());

        gear.setShoes(new Shoes("New Balance"));
        System.out.println(gear.getShoes());

        gear.setClothes(new Clothes("CMP Woman Long Pants", "CMP Woman Jacket" ));
        System.out.println(gear.getClothes());

        //Виклик усіх методів класу
        gear.putOnShoes();
        gear.wearClothes();
        gear.tieRope();
        gear.checkGear();
        gear.startClimbing();
        gear.descend();
        gear.sendSignal();
        gear.packGear();
    }
}
