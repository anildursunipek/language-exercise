public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    public void addCustomer(){
        System.out.println("Customer added...");
        this.logger.log("Log message");
    }
}
