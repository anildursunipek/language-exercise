public class Main {
    public static void main(String[] args) {
        // Generic: Birbirine benzeyen operasyonlari tip guvenli bir sekilde yazmamizi saglar
        // Tip safe arraylist buna bir ornektir
        // public class TestClass<Type>{} -> Syntax
        // TestClass<int> obj = new TestClass<int>() -> Example
        Validator validator = new Validator();
        validator.validate(new Customer());
        validator.validate(new Product());
        // validator.validate(new CustomerDal()); Generic metod IEntity ile extend edilmis bir parametre istedigi icin hata verir
    }
}