package WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle {

    // overides the parent class drive method with sport driving mode 
    // Notice how we are duplicating and re written code with Sports Vehicle too.
    public void drive(){
        System.out.println("Sports Driving Mode");
    }
}
