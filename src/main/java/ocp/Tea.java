package ocp;

public class Tea extends Beverage {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "type='" + type + '\'' +
                '}';
    }
}