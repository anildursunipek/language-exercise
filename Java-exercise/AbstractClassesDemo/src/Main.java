public class Main {
    public static void main(String[] args) {
        // Musteriyi veri tabanina kayit etme ornegi
        // Bir tasarim deseni
        // Musteriler farkli veri tabanlari kullanabilecegi icin farkli musterilerin kullanacagi veri tabanina uygun kod yazmaliyiz
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomer();
        customerManager.databaseManager = new MysqlDatabaseManager();
        customerManager.getCustomer();
        customerManager.databaseManager = new SqlServerDatabaseManager();
        customerManager.getCustomer();
        // Bu ornekte musterilerin database degistirmesi veya illerde sisteme yeni bir database eklenmesi kolaylikla saglanabilmektedir.
        // Eger yeni bir database eklemek istersek BaseDatabaseManager sinifini miras alarak kolaylikla saglayabiliriz
    }
}