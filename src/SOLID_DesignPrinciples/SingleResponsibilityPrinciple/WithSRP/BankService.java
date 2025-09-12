package SOLID_DesignPrinciples.SingleResponsibilityPrinciple.WithSRP;

// Following SRP
// Now we have only one responsibility to perform for this class
// all other responsibilities will be handled by other classes like printPassbookService,
// loanInterestInfoService, notificationService
// if we want to change any other service, we will not need to change this class
public class BankService {
    public int deposit(int amount, String account_no){
        return 0;

    }

    public int withdraw(int amount, String account_no){
        return 0;
    }

}
