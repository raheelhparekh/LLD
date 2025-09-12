package SOLID_DesignPrinciples.OpenClosedPrinciple;

public class SmsNotification implements NotificationService{
    @Override
    public void sendOtp(String medium) {
        System.out.println("OTP sent via SMS");
    }

    @Override
    public void sendReport(String medium) {
        System.out.println("Report sent via SMS");
    }

}
