public class Product {
    // Ornek -> Bir urunun ozellikleri
    // attribute or field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod; // -> Bu blok uzerinde erisim saglayabilirz ancak farkli bir blok icinde bi attribute'a erisemeyiz
    // İyi kod yazmak icin karisikligi onlemek adina degiskenlerin basina "_" koyariz. Bu getter ve setter'daki karisikliklari onleyebilir
    // Getter -> Getirmek, almak
    public int getId(){ // id'yi okuyabilmemizi saglar -> Readonly
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public double getPrice(){
        return this.price;
    }
    public int getStockAmount(){
        return this.stockAmount;
    }
    public String getKod(){
        return this.name.substring(0,1) + this.id;
    }

    // Setter -> Ayarlamak
    public void setId(int id){
        this.id = id; // id'lerin karismamasi icin this kullanabiliriz
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setStockAmount(int stockAmount){
        this.stockAmount = stockAmount;
    }
}
