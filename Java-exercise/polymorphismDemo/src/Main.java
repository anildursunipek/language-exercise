public class Main {
    public static void main(String[] args) {
        // Polymorphism: Cok bicimlilik
        // Overriting ve overloading gibi metodlar kullanabiliriz
        // Overriting: Bir class'in baska bir class'dan miras aldigi metodu degistirerek tamamen yeni bir metod yazma islemi
        // DatabaseLogger logger = new DatabaseLogger();
        // logger.Log("Log message");

        // Bu islemi cok bicimli bir sekilde yapmak icin ayni metodun for dongusu ile farkli class'larda kullanildigi bir ornek;
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger()};
        for(BaseLogger logger : loggers){
            logger.log("Log message");
        }
        // Bu sekilde polymorphism sayesinde sistem kolaylikla güncellenebilir ve gelistirilebilir oluyor
        // Herhangi bir ekleme yapilmasi gerekirse inheritance yapilarak farkli class'lar ayni metodu kullanabilir.

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.addCustomer();
        CustomerManager customerManager1 = new CustomerManager(new FileLogger());
        customerManager1.addCustomer();
        // Loglama orneginde olusturdugumuz CustomerManager class'ı gelecekte farkli sekillerde loglanabilecegi icin loglamayi sabit metod icinde yapmadik
        // Loglama isleminin yapilacagi yeri constructor ile kullanicidan alarak metod icine aktardik
        // Cok bicimlilik ile de farkli log alanlarina erisebilmek icin BaseLogger class'ini kullandik
        // Diger class'lar BaseLogger'a referans olabildigi icin constructor'da belirtilen logger'a gore cikti almamizi sagladi
    }
}