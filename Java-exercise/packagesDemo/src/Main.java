import TestPackage.TestClass;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // built-in: Javada gomulu mevcut olan paketler
        // import ile paket eklenir
        // Scanner: kullanıcıdan veri alma islemleri yapilir
        Scanner data = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = data.nextLine();
        System.out.println("Hello " + name);
        int num1 = 5, num2 =6;
        // User-defined package
        TestClass obj = new TestClass();
        System.out.println(obj.plus(num1,num2));
    }
}