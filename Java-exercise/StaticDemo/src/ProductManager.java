public class ProductManager {
    public void add(Product product){
        // ProductValidator productValidator = new ProductValidator();
        if(ProductValidator.isValid(product)){ // Static yapida oldugu icin yeni bir nesne olusturmadan class ismi ile tek seferlik bir kullanim yapabiliyoruz
            System.out.println("Product added...");
        }
        else{
            System.out.println("Product could not be added...");
        }
    }
}
