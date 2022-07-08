public class Main {
    public static void main(String[] args) {
        // if else coditions
        int num = 50;
        if (num > 25) {
            System.out.println("Number bigger than 25");
        } else if (num == 50) {
            System.out.println("Number is 50");
        } else {
            System.out.println("Number smaller than 25");
        }
        // Basic example = Find biggest number
        int num1 = 20, num2 = 32, num3 = 15, max;
        max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("The biggest number: " + max);

        // Switch case blocks
        char grade = 'B';
        switch (grade) {// Koşula göre olaylar gerçekleşir. Eger hiç biri gerçekleşmez ise default olayına gidilir
            case 'A':
                System.out.println("Perfect = You passed");
                break;
            case 'B':
                System.out.println("Very good = You passed");
                break;
            case 'C':
                System.out.println("Good = You passed");
                break;
            case 'D':
                System.out.println("Not bad = You passed");
                break;
            case 'F':
                System.out.println("Bad = You failed the exam");
                break;
            default:// Default hiç bir case çalışmaz ise son olarak çalışacak durumdur
                System.out.println("You entered an invalid grade");
                break;
        }
        // Eğer switch blogunda 2 olayın da çıktısı aynı ise ortak bir şekilde yazılabilir
        int num4 = 3;
        switch(num4){
            case 1: case 2: case 3:
                System.out.println("Case 1-2-3");
                break;
            case 4: case 6:
                System.out.println("Case 4");
                break;
            case 5:
                System.out.println("Case 5");
                break;
        }
    }
}
