public class HouseLoanManager extends BaseLoanManager {
    private double fee = 1.35;
    public double calculateLoan(double loan){
        return loan * fee;
    }
}
