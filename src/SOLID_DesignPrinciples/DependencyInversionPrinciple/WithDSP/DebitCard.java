package SOLID_DesignPrinciples.DependencyInversionPrinciple.WithDSP;

public class DebitCard implements BankCard {
    @Override
    public void makePayment(int amount) {
        System.out.println("payment done using debit card");
        
    }

}
