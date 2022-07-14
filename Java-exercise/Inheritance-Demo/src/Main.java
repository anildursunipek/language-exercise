public class Main {
    public static void main(String[] args) {
        EducationLoanManager educationLoanManager = new EducationLoanManager();
        HouseLoanManager houseLoanManager = new HouseLoanManager();
        houseLoanManager.takeLoan();
        LoanUI loanUI = new LoanUI();

        // Parametre olarak baseLoanManager class'ının 2 alt miras alan class'ı calculateManager metodunun parametresi olarak kullanilabiliyor
        /*Bir bankada bir suru kredi cesidi olabilir. Spagetti kod yazmaktan yani kotu kod yazmaktan kacinmak icin bir suru if kullanmak yerine
         *bir tane ana class olusturup digerlerini mirasci yapabilirz. Bu sayede farkli bir sinifin altinda olusturabilecegimiz bir metodda guncellenebilir
         * ve kolaylikla degisebilir bir kod yazmis oluruz. Ornegin bu ornekte egitim ve ev kredisi adi altinda 2 farkli class vardir. BaseClassManager bu 2
         * class'ın mirascisi olmaktadir. Sonuc olarak bir metoda BaseClassManager'ı parametre olarak girebilrisek diger 2 kredi cesidinin veya ilerleyen zamanlarda
         * olusturulabilecek krediler icin yazdigimiz kodu degistirmek yerine sadece mirasci olarak BaseClassManageri alirsak hizli bir sekilde kodumuzu güncelleyebiliriz.
         * Main class'da metodu calistirdigimizda metodun parametresi BaseClassManager'in mirasci oldugu diger class'lar da olabilmektedir.   */

        loanUI.calculateLoan(houseLoanManager);
        loanUI.calculateLoan(educationLoanManager);
    }
}