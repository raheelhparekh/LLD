package SOLID_DesignPrinciples.OpenClosedPrinciple;

public class EmailNotification implements NotificationService {
    @Override
    public void sendOtp(String medium) {
        System.out.println("OTP sent via Email");
    }

    @Override
    public void sendReport(String medium) {
        System.out.println("Report sent via Email");
    }

}
