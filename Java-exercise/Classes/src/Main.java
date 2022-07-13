public class Main {
    public static void main(String[] args) {
        CustomerManager customer = new CustomerManager(); // CustomerManager sınıfından bir nesne olusturuldu
        // NesneTuru nesneIsmi = new NesteTuru(); -> Sınıfın olusturulabilmesi icin initialize(baslatilmasi) gerekir
        customer.Add();
        customer.Remove();
        customer.Update();
        // Sınıflar referans tipi calismaktadir.
        // Sınıf olustururken bellekten buyuk bir alan ayrilir. New sınıfAdi() yaptigimizda bu alanı olustururz
        // Gereksiz sinif tanımlamak bellegin gereksiz kullanimina yol acar
        // BU gereksiz nesneler Java'nin kendisinde bulunan Garbage Collector ile silinir ve alan tasarufu yapilir
        // Example
        CustomerManager customer2 = new CustomerManager();
        // Reference Type !!!
        customer = customer2;
        // Bu atama sonucunda ilk olusturdugumuz customer bosa cikacak ve bellekde gereksiz alan kaplar hale gelicek
        // Nesneler referans tipi oldugu icin c'deki pointer mantigi gibi artik customer, customer2'nin bellek id'sini tutacak
        // Bu nedenle de 1. olusturulan nesne bosa cikmis olur
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{3, 4, 5};
        array2 = array1;
        array1[0] = 100;
        System.out.println(array2[0]); // Referans olarak bellek id'si atandigi icin artik array1 dizisi array2 ile aynidir
        // array1 uzerindeki degisiklikler array2 de de gozukecektir

        // Value Type !!!
        int num1 = 10;
        int num2 = 20;
        num2 = num1;
        num1 = 30;
        System.out.println(num2 + "-> Value Type"); // Deger tipi oldugu icin 10 degerini yazdirir
        // int , byte, bool gibi degisken tipleri deger tiplidir
    }
}