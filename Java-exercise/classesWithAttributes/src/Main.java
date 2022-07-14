public class Main {
    public static void main(String[] args) {
        // Yazilim gelistirme prensiplerine gore 1 class en fazla 1 isi yapmalidir
        // Bu ornekte Product ve ProductManager adi altinda 2 class olusturuldu
        // Product class'ı urune ait attriubte'ları tutarken
        // ProductManager class'ı product class'ını kullanarak uzerinde ekleme, silme, guncelleme gibi islemleri yaptigimiz metodları icerir

        // Product Attribute
        Product product = new Product();
        // product.id = 1; // Setter olmadan set etme islemi
        product.setId(1); // Setter kullanimi
        // product.description = "Monster Laptop";
        product.setDescription("Monster Laptop");
        // product.price = 15000;
        product.setPrice(15000);
        // product.name = "Laptop";
        product.setName("Laptop");
        System.out.println(product.getDescription());
        System.out.println("Product Code -> " + product.getKod());

        // Product Manager
        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        // Encapsulation -> Enkapsulasyon
        // CLass'ın attribute'ları uzerindeki erisim kisitlamalarina kapsulleme denir
        // Java da attribute'lar public ve private olarak 2 ye ayrilir
        // Java default public'dir
        // Private: Ozelliklere sadece bulundugu blok icersinde erisim vardir
        // Disaridan bu ozelliklere erisim olmaz
        // Eger disaridan bu ozellikleri degistirmeden erismek istersek yada belli kosullarda degistirmek istersek getter ve setter'ları kullanmamiz gerekir

    }
}