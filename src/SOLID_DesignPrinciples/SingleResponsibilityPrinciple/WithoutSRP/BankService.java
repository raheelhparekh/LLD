package SOLID_DesignPrinciples.SingleResponsibilityPrinciple.WithoutSRP;

// Not following SRP
// Each class must have only one responsibility to perform
// if there are update required in future, we will need to modify this code
// this class has too many reponsibilities to perform

public class BankService {

    public int deposit(int amount, String account_no){
        return 0;

    }

    public int withdraw(int amount, String account_no){
        return 0;
    }

    public void printPassbook(String account_no){
        System.out.println("passbook print");
    }

    public void getLoanInterestDetails(String loanType){
        if(loanType.equals("Gold")){
            System.out.println("10%");
        }
        if(loanType.equals("Education")){
            System.out.println("15%");
        }

    }

    public void sendOtp(String medium){

        if(medium.equals("SMS")){
            System.out.println("OTP sent via SMS");
        }
        if(medium.equals("Email")){
            System.out.println("OTP sent via Email");
        }

    }
}
