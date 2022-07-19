import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Siniflarin objelerini de ArrayList ile tutabilirz
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Harvey","Spector"));
        // customers.add(new Customer(2,"Jessica","Pearson"));
        customers.add(new Customer(3,"Mike","Ross"));
        // Eger listeden eleman silmek istersek onun referans'ini bir degiskene atamamiz gerekir
        Customer jessica = new Customer(2,"Jessica","Pearson");
        customers.add(jessica);
        customers.remove(jessica);
        // Yada get ile index kullanarak silebiliriz
        // customers.remove(customers.get(1));
        for(Customer customer:customers){
            System.out.println(customer.id + " -> " + customer.firstName + " " + customer.lastName);
        }
    }
}