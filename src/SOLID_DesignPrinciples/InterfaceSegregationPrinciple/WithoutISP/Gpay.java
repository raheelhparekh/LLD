package SOLID_DesignPrinciples.InterfaceSegregationPrinciple.WithoutISP;

public class Gpay implements UpiPayments {
    @Override
    public void upiPayment() {
        System.out.println("Upi Payment using Gpay");
    }

    @Override
    public void upiTransfer() {
        System.out.println("Upi Transfer using Gpay");
    }

    @Override
    public void getRewardsAsCashback() {
        System.out.println("Get rewards as cashback using Gpay");
    }

}
