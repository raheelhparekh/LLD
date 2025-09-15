package SOLID_DesignPrinciples.DependencyInversionPrinciple.WithDSP;

public class ShoppingMall {

    BankCard card;

    ShoppingMall(BankCard card){
        this.card=card;
    }

    public void doPurchase(int amount) {
        card.makePayment(amount);
    }

    public static void main(String[] args) {
        // BankCard bankCard=new DebitCard();
        BankCard bankCard=new CreditCard();

        ShoppingMall mall=new ShoppingMall(bankCard);
        mall.doPurchase(1000);
    }
}
