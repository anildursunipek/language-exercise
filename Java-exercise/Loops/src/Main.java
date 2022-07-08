public class Main {
    public static void main(String[] args) {
        // For
        for(int i=1;i<10;i++){  // for(sayaç değeri tanımı ; sayaç koşulu ; sayaçın kaçar kaçar artıp azalacağı) {İŞLEM KISMI}
            System.out.println(i);
        }
        System.out.println("For loop ended");
        // Odd numbers
        for(int i=1;i<=10; i +=2 ){
            System.out.println(i);
        }
        System.out.println("For loop ended");
        /*
        ->Note: For gibi bloklarda tanımlanan değişkenler sadece o blok içerisinde geçerlidir.
        ->O blokta tanımlanan değişkeni başka bir blokta kullanamayız
        -> Ancak global tanımlanan değişkenler alt bloklarda kullanılabilir
         */

        // While
        // For ile yapabildiğimiz her şeyi while ile de yapabiliriz
        // While içerisinde koşul sonlanan bir durum belirtmiyorsa infinitive loop oluşur. Bu da bir hata olur.

        // Odd nubmers with while loop
        int i = 1;
        while(i<10){
            System.out.println(i);
            i +=2;
        }
        System.out.println("While loop ended");

        // DO-While
        /*
        -> Cok fazla kullanılan bir dongu tipi degildir
        -> While dongusune cok benzerdir
        -> En buyuk farki kosul kontrolu yapılmadan dongunun 1 kere calismasidir
        -> Sart saglanmasa bile donguye 1 defa girilmesini saglar
        -> Bunun en buyuk artısı kullanıdan ilk degeri alırken do ile degeri alıp while ile kontrol etmektir
         */
        i = 1;
        do{
            System.out.println(i);
            i +=2;
        }while(i<10);
        System.out.println("Do-while loop ended");
    }
}