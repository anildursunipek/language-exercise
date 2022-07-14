public class Main {
    public static void main(String[] args) {
        // Inheritance -> Miras,Kalitim
        // Bir nesne digerine miras birakir
        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.setAge(25);
        System.out.println(customer.getAge());
        employee.setFirstname("Mike");
        System.out.println(employee.getFirstname());

        // Methods - inheritance
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
        customerManager.Update();// inherited Update method
        employeeManager.Update();// inherited update method
    }
}