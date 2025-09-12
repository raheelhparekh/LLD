package SOLID_DesignPrinciples.OpenClosedPrinciple;

public class WhatsappNotification implements NotificationService{
    @Override
    public void sendOtp(String medium) {
        System.out.println("OTP sent via Whatsapp");
    }

    @Override
    public void sendReport(String medium) {
        System.out.println("Report sent via Whatsapp");
    }

}
