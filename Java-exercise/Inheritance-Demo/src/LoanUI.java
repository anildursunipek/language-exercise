public class LoanUI {
    public void calculateLoan(BaseLoanManager baseLoanManager){
        // baseLoanManager iki class'ın da miras vereni oldugu icin referans tipini kullanarak ikisini de kullanilabilir kiliyoruz
        // kisaca LoanUI sınıfındaki calculateLoan metodunun 2 farkli sinif icinde kullanilabilir olmasını mumkun kiliyor
        System.out.println("Loan Calculated...");
    }
}
