import java.util.HashMap;

public class AccountManager {
    private double balance;
    public void deposit(int amount){ // Para yatirma islemi
        balance += amount;
    }
    public void withdraw(int amount) throws Exception{ // Para cekme islemi
        if(balance >= amount){
            balance -= amount;
        }else{
            throw new Exception("Insufficient account balance");
        }
    }
    public double getBalance(){
        return this.balance;
    }
}
