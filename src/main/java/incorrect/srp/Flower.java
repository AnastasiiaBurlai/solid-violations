package incorrect.srp;

//lets ruin SRP
//Flower can grow, blossom, but it cannot water itself
//It is better to have separate WateringService for this
public class Flower {

    private int size = 0;
    private boolean isBlooming = false;
    private int requiredDegreeOfMoisture;
    private int degreeOfMoisture = 0;

    public void addDegreeOfMoisture(int amountOfWater){
        degreeOfMoisture += amountOfWater;
    }

    public void grow(){
        if(degreeOfMoisture == requiredDegreeOfMoisture)
            size++;
    }

    public void bloom(){
        isBlooming = true;
    }

    public void water(WateringCan wateringCan, int amountOfWater){
        wateringCan.pour(amountOfWater);
        addDegreeOfMoisture(amountOfWater);
    }
}
