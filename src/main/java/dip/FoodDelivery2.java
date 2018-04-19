package dip;

//this is to illustrate the changes
public class FoodDelivery2 {

    private Pizza[] foodToBeDelivered;
    private Bike bike;
    private Car car;

    public void deliver(String location){
        for(Pizza pizza : foodToBeDelivered){
            pizza.pack();
        }
        if(bike!=null){
            bike.driveTo(location);
        }else{
            car.driveTo(location);
        }
    }
}
