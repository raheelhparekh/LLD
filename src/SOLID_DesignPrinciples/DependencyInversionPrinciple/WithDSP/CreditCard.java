package SOLID_DesignPrinciples.DependencyInversionPrinciple.WithDSP;

public class CreditCard implements BankCard {

    @Override
    public void makePayment(int amount) {
        System.out.println("payment done using credit card");
        
    }

}
