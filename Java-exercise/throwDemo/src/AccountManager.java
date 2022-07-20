import java.util.HashMap;

public class AccountManager {
    private double balance;
    public void deposit(int amount){ // Para yatirma islemi
        balance += amount;
    }
    public void withdraw(int amount) throws BalanceInsufficientException{ // Para cekme islemi
        if(balance >= amount){
            balance -= amount;
        }else{
            // throw new Exception("Insufficient account balance");
            // Custom Exception
            throw new BalanceInsufficientException("Insufficient account balance");
        }
    }
    public double getBalance(){
        return this.balance;
    }
}
