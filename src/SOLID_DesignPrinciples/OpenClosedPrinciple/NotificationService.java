package SOLID_DesignPrinciples.OpenClosedPrinciple;

// with this this class can be extended for various features but closed for modification
public interface NotificationService {

    public void sendOtp(String medium);

    public void sendReport(String medium);

}
