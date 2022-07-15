public class EducationLoanManager extends BaseLoanManager {
    private double fee = 1.27;
    public double calculateLoan(double loan){
        return loan * fee;
    }
}
