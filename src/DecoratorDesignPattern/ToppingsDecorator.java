package DecoratorDesignPattern;

public abstract class ToppingsDecorator implements BasePizza {

    BasePizza basePizza;
    public ToppingsDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    public int cost(){
        return this.basePizza.cost();
    }
    

}
