public class ProductValidator {
    static{ // Birden fazla static blok calistirilabilir ancak cok kullanisli degildir
        System.out.println("Static initialized...");
    }
    public ProductValidator(){
        System.out.println("Constructor initialized...");
    }
    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            System.out.println("Product information verified...");
            return true;
        }
        else{
            System.out.println("Product information could not verified...");
            return false;
        }
    }
    public void testMethod(){
        System.out.println("Test Method");
    }
}
