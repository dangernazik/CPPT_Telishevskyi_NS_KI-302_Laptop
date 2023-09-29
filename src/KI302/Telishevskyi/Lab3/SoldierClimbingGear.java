package KI302.Telishevskyi.Lab3;

import KI302.Telishevskyi.Lab2.Clothes;
import KI302.Telishevskyi.Lab2.Rope;
import KI302.Telishevskyi.Lab2.Shoes;

public class SoldierClimbingGear extends AbstarctClimbingGear {

    private String Weapon;

    public SoldierClimbingGear() {
        super();
    }

    public SoldierClimbingGear(Shoes shoes, Clothes clothes, Rope rope, String weapon) {
        super(shoes, clothes, rope);
        this.Weapon = weapon;
    }

    @Override
    public void climb() {
        System.out.println("Військовий альпініст піднімається");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Weapon - {Weapon='" + Weapon + '\'' +
                '}';
    }
}
