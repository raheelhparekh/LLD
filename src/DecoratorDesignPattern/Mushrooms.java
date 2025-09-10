package DecoratorDesignPattern;

public class Mushrooms extends ToppingsDecorator{

    public Mushrooms(BasePizza basePizza){
        super(basePizza);
    }
    public int cost(){
        return this.basePizza.cost() + 15;
    }

}
