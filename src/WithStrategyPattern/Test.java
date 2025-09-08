package WithStrategyPattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("Testing Strategy Pattern...");
        
        PassengerVehicle passenger = new PassengerVehicle();
        SportsVehicle sports = new SportsVehicle();
        OffRoadVehicle offRoad = new OffRoadVehicle();
        
        System.out.print("Passenger Vehicle: ");
        passenger.drive();
        
        System.out.print("Sports Vehicle: ");
        sports.drive();
        
        System.out.print("Off Road Vehicle: ");
        offRoad.drive();
    }
}
