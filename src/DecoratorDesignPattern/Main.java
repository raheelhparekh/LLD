package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== Decorator Design Pattern Demo ===");
        
        // Example 1: FarmHouse Pizza with Extra Cheese and Mushrooms
        System.out.println("\n1. FarmHouse Pizza with toppings:");
        BasePizza pizza1 = new FarmHousePizza();
        System.out.println("   Base FarmHouse Pizza: $" + pizza1.cost());
        
        pizza1 = new ExtraCheese(pizza1);
        System.out.println("   + Extra Cheese: $" + pizza1.cost());
        
        pizza1 = new Mushrooms(pizza1);
        System.out.println("   + Mushrooms: $" + pizza1.cost());
        
        // Example 2: Veggie Delight Pizza with multiple decorators
        System.out.println("\n2. Veggie Delight Pizza with toppings:");
        BasePizza pizza2 = new VeggieDelightPizza();
        System.out.println("   Base Veggie Delight Pizza: $" + pizza2.cost());
        
        pizza2 = new Mushrooms(pizza2);
        pizza2 = new ExtraCheese(pizza2);
        pizza2 = new Mushrooms(pizza2);
        System.out.println("   + Mushrooms + Extra Cheese + More Mushrooms: $" + pizza2.cost());
        
        // Example 3: Just base pizza
        System.out.println("\n3. Plain pizza (no decorators):");
        BasePizza pizza3 = new FarmHousePizza();
        System.out.println("   Just FarmHouse Pizza: $" + pizza3.cost());
        
        System.out.println("\n=== Decorator Pattern demonstrates dynamic behavior composition! ===");
    }
}
