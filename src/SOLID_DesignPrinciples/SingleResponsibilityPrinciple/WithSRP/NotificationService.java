package SOLID_DesignPrinciples.SingleResponsibilityPrinciple.WithSRP;

public class NotificationService {
    public void sendOtp(String medium){

        if(medium.equals("SMS")){
            System.out.println("OTP sent via SMS");
        }
        if(medium.equals("Email")){
            System.out.println("OTP sent via Email");
        }

    }

}
