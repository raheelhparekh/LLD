package SOLID_DesignPrinciples.SingleResponsibilityPrinciple.WithSRP;

public class LoanInterestInfoService {

    public void getLoanInterestDetails(String loanType){
        if(loanType.equals("Gold")){
            System.out.println("10%");
        }
        if(loanType.equals("Education")){
            System.out.println("15%");
        }

    }

}
