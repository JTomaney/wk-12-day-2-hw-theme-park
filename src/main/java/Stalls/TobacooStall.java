package Stalls;

import Interfaces.ISecurity;
import Visitors.Visitor;

public class TobacooStall extends Stall implements ISecurity {

    public TobacooStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
