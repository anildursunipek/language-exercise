public class CustomerManager {
    private ICustomerDal iCustomerDal;
    public CustomerManager(ICustomerDal iCustomerDal){
        this.iCustomerDal = iCustomerDal;
    }

    public void add(){
        // is kodlarinin yazildigi kisim
        iCustomerDal.add();
    }
}
