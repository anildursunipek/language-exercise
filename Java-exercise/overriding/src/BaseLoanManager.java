public class BaseLoanManager {
    private double fee;
    public double calculateLoan(double loan){ // Overridable !!!
        return loan * fee;
    }
}
