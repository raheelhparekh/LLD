package SOLID_DesignPrinciples.DependencyInversionPrinciple.WithoutDSP;

// this is tightly coupled with debit card. what if i want to make payment using credit card. i had to change every code to credit card.
public class ShoppingMall {

    // DebitCard debit=new DebitCard();
    CreditCard credit= new CreditCard();

    // ShoppingMall(DebitCard debit){
    //     this.debit=debit;
    // }

    ShoppingMall(CreditCard credit){
        this.credit=credit;
    }

    public void doPurchase(int amount) {
        credit.makePayment(amount);
    }


    public static void main(String[] args) {
        // DebitCard debit=new DebitCard();
        // ShoppingMall mall=new ShoppingMall(debit);
        // mall.doPurchase(5000);

        CreditCard credit=new CreditCard();
        ShoppingMall mall2=new ShoppingMall(credit);

        mall2.doPurchase(1000);
    }

}
