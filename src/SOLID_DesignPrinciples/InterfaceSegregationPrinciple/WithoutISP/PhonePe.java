package SOLID_DesignPrinciples.InterfaceSegregationPrinciple.WithoutISP;

public class PhonePe implements UpiPayments {

    @Override
    public void upiPayment() {
        System.out.println("Upi Payment using PhonePe");
    }

    @Override
    public void upiTransfer() {
        System.out.println("Upi Transfer using PhonePe");
    }

    @Override
    public void getRewardsAsCashback() {
    // this rewards feature is not supported by PhonePe so we have to still implement the method even though it is not used and required. this violates the interface segregation principle
    }

}
