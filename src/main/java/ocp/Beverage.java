package ocp;

import java.util.Arrays;

//Lets ruin OCP
//Beverage contains recipes of its subclasses, and that makes it really sensitive to changes
//For example, if we Juice to our hierarchy, we will need to write one more branch in if clause
//and specify recipe for it, so for now this class is opened for modifications
//To avoid this, we need to move recipe logic (mix method) to subclasses
public abstract class Beverage {

    private String[] ingredients;

    private void mix() {
        System.out.println("Mixed beverage from following ingredients: " +
                Arrays.toString(ingredients));
    }

    public void mix(Beverage beverage) {
        if (beverage instanceof Coffee) {
            ingredients = new String[]{((Coffee) beverage).getDegreeOfRoasting()
                    + " roasted beans", "hot water"};
        } else if (beverage instanceof Tea) {
            ingredients = new String[]{((Tea) beverage).getType() + " tea", "hot water"};
        } else {
            throw new IllegalArgumentException("Unidentifiable beverage");
        }
        mix();
    }

    public void serveBeverage() {
        System.out.println(String.format("%s beverage is served", this.toString()));
    }
}