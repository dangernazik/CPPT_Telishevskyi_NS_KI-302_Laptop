package KI302.Telishevskyi.Lab3;

import KI302.Telishevskyi.Lab2.Clothes;
import KI302.Telishevskyi.Lab2.Rope;
import KI302.Telishevskyi.Lab2.Shoes;

public class Main {
    public static void main(String[] args) {
        SoldierClimbingGear  sg = new SoldierClimbingGear(
                new Shoes("brandShoes"),
                new Clothes("jaccket", "pants"),
                new Rope(123),
                "riffle");
        System.out.println(sg);
        sg.climb();
    }
}