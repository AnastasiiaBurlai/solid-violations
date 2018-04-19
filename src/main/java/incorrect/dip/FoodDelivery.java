package incorrect.dip;

//lets ruin DIP
//for example, for now we are delivering only pizzas, driving on a bike
//what if we decide to deliver pasta also? or to use cars also?
//We should do IDeliverableFood and ITransport interfaces
public class FoodDelivery {

    private Pizza[] foodToBeDelivered;
    private Bike bike;

    public void deliver(String location){
        for(Pizza pizza : foodToBeDelivered){
            pizza.pack();
        }
        bike.driveTo(location);
    }
}