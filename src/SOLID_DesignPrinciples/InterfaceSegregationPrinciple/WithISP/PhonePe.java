package SOLID_DesignPrinciples.InterfaceSegregationPrinciple.WithISP;

public class PhonePe implements UpiPayments {
    @Override
    public void upiPayment() {
        System.out.println("Upi Payment using PhonePe");
    }

    @Override
    public void upiTransfer() {
        System.out.println("Upi Transfer using PhonePe");
    }

}
