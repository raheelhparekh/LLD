package DecoratorDesignPattern;

public class ExtraCheese extends ToppingsDecorator{

    public ExtraCheese(BasePizza basePizza){
        super(basePizza);
    }

    public int cost(){
        return this.basePizza.cost() + 10;
    }

}
