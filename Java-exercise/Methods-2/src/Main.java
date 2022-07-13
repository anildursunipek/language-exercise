public class Main {
    public static void main(String[] args) {
        // Void operasyon: Geri deger dondurmeden sadece istenen isi yapan operasyonlar
        // Ex: public static void methodName(parameters){}
        // Bir metod geri deger donduruyorsa atama ile yada print ile ekrana cikti verir
        // Return ile geri deger dondurebiliriz
        // Ex: public static int update(){return -----;}

        // Veriable Arguments
        System.out.println(total(3,4,5,1,2,8,19));
        System.out.println(total(5,3,8));


    }
    public static int total(int... numbers){ // "int... veriableName" -> Bu sekilde tanimlanirsa sinirsiz arguman girilebilir
        int total = 0;
        for(int num : numbers){ // Girilen degiskenleri bir dizi gibi kullanabiliriz
            total += num;
        }
        return total;
    }
}