public class Product {
    // Ornek -> Bir urunun ozellikleri
    // attribute or field

    // Consturctor -> Yapıcı metod
    // Sınıf tanımlarken 2 farkli secenek ile attribute tanimlamasi yapabilriz
    // Biri getter ve setter'lar ile attribute tanimlamaktir
    // İkincisi yapıcı metod kullanarak yeni bir nesne olustururken tum attribute'lari girebiliriz

    public Product(int id, String name, String description, double price, int stockAmount) { // Constructor ismi class ile ayni isimde olmalidir
        System.out.println("Constructor initialized");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public Product() {
        // parametresiz yapıcı metod
        // getter setter ile attribute'lara atama yapilabilir
        // overloading yontemi ile 2'sinden birini kullanabiliriz
    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod; // -> Bu blok uzerinde erisim saglayabilirz ancak farkli bir blok icinde bi attribute'a erisemeyiz

    // İyi kod yazmak icin karisikligi onlemek adina degiskenlerin basina "_" koyariz. Bu getter ve setter'daki karisikliklari onleyebilir
    // Getter -> Getirmek, almak
    public int getId() { // id'yi okuyabilmemizi saglar -> Readonly
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public int getStockAmount() {
        return this.stockAmount;
    }

    public String getKod() {
        return this.name.substring(0, 1) + this.id;
    }

    // Setter -> Ayarlamak
    public void setId(int id) {
        this.id = id; // id'lerin karismamasi icin this kullanabiliriz
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
