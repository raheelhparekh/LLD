package WithoutStrategyPattern;

public class TestWithoutStrategy {
    public static void main(String[] args) {
        System.out.println("Testing WITHOUT Strategy Pattern...");
        
        PassengerVehicle passenger = new PassengerVehicle();
        SportVehicle sport = new SportVehicle();
        OffRoadVehicle offRoad = new OffRoadVehicle();
        
        System.out.print("Passenger Vehicle: ");
        passenger.drive();
        
        System.out.print("Sport Vehicle: ");
        sport.drive();
        
        System.out.print("Off Road Vehicle: ");
        offRoad.drive();
    }
}
