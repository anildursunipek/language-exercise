public class Main {
    public static void main(String[] args) {
        // NYP'nin 3 temel ogesinden biridir
        /* 1- Classes
            2-Abstract Classes
            3-Interfaces */
        // Interfaces
        // Isimlendirme de basina "I" harfi getirilir. Kesin kural olmasa da iyi kod yazmaya ornektir
        // ICustomerDal -> "Dal" : Data acces layer -> veri erisim katmani
        // Polymorphism'in en iyi uygulandigi yapilardan biridir
        // Sınıf kabule edilmektedir ancak normal siniflar yada soyut siniflar gibi referans kabul edilmektedirler
        // 1 sinif birden fazla interface inherit edebilir. Temel fark budur.
        // Interface uyeleri default olarak public'dir
        // Abstract'lar gibi new'leyemeyiz
        // Implement edilen diger class'lar referans tutabilirler (Polymorphism)
        /* Nerede kullanilir ?
        *  -> Katman gecislerini interface ile saglariz
        *  -> Temel anlamda referans olabilirler ve imza tasirlar
        *  -> Bir class birden fazla interface implement edebilirler
        *  -> Bir sinif miras alinirken interface'ler de implement edilebilir
        *  -> Operasyonu implement edilmesi istenilen durumlarda kullanlir */
        // Example:
        /*  -> Interface new islemi dogru bir yazim degildir
        ICustomerDal iCustomerDal = new ICustomerDal() {
            @Override
            public void add() {

            }
        }
        */
        /*OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
        oracleCustomerDal.add();*/
        // İleride database turu degisebilecegi icin daha iyi bir kod yazabiliriz
        /*CustomerManager customerManager = new CustomerManager();
        customerManager.iCustomerDal = new OracleCustomerDal();
        customerManager.add();
        customerManager.iCustomerDal = new MySqlCustomerDal();
        customerManager.add();*/
        // her seferinde atama islemi yapmamak icin database turunu constructor ile alabiliriz
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
        CustomerManager customerManager1 = new CustomerManager(new MySqlCustomerDal());
        customerManager1.add();
    }
}