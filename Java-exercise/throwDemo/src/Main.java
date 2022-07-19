public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Balance: " + manager.getBalance());
        manager.deposit(500);
        System.out.println("Balance: " + manager.getBalance());
        try {
            manager.withdraw(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance: " + manager.getBalance());
        try {
            manager.withdraw(450);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance: " + manager.getBalance()); // Bu asamada balance -'ye dusuyor. Normal sartlarda dusmemesi gerekiyor
    }
}