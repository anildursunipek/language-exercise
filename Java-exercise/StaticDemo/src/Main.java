import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        // Static yapilar new islemi ile ulasmak yerine direk className.methodName seklinde ulasilabilir yapiladrdir
        // Genellikle utility tools icin kullanilan cok yaygin olmayan bir yontemdir
        // Metod static yapildiginda artiks class ismi ile tek seferlik bir ornek olusturularak erisilebilir hale gelir
        /* Normal metodlardan farki class new'lendiginde kullanimi bittiginde silinir ancak
        static metodlar tek seferlik olusturulup calisma suresi boyunca bellekte tutulmaya devam edilir*/
        Product product = new Product(1,"Product",100);
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println("-------------------------------");
        // Static constructor calistirmaz onun yerine static adi altinda acilan blok constructor calistirir
        // Example:
        ProductValidator productValidator = new ProductValidator();
        productValidator.testMethod();
        System.out.println("-------------------------------");
        System.out.println(ProductValidator.isValid(product));
    }
    // Inner class
    // Genellikle siniflandirma, bolumkendirme icin yapilir
    // Solid prensiplerine uygun bir kullanim degildir
    // Bir sinif tek seferde bir adet isi yapabilir inner class'lar buna uygun bir kullanim degildir
    // Example:
    // DataBaseHelper.Crud.Delete();
    // DataBaseHelper.Connection.Connect();
}