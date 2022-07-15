public class Main {
    public static void main(String[] args) {
        BaseLoanManager[] loans = new BaseLoanManager[]{new HouseLoanManager(),new EducationLoanManager()};
        for(BaseLoanManager loan : loans){
            System.out.println(loan.calculateLoan(10000));
        }
        // Aksi belirtilemdigi surece miras alinan tum metodlar overridable'dır
        // Eger override yapilmasini istemiyorsak final anahtarini kullanmamiz gerekir
        // Ex : public final void methodName(){}
    }
}