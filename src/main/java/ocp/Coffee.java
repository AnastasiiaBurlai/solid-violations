package ocp;

public class Coffee extends Beverage {

    private String degreeOfRoasting;

    public String getDegreeOfRoasting() {
        return degreeOfRoasting;
    }

    public void setDegreeOfRoasting(String degreeOfRoasting) {
        this.degreeOfRoasting = degreeOfRoasting;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "degreeOfRoasting='" + degreeOfRoasting + '\'' +
                '}';
    }
}