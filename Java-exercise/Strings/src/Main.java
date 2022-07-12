import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Strings
        String text = "Weather is sunny.";
        System.out.println(text);
        // String'ler karakter dizileridir. "Character array"

        // Length() -> uzunluk dondurur
        System.out.println("Text lenght: " + text.length());

        // charAt(index sayisi)
        System.out.println("5th char -> " + text.charAt(4)); // charAt(): Bir metinde belli bir karakteri seçmek için kullanılan metod

        // concat()
        System.out.println(text.concat(" Wonderful!!"));

        // startsWith() -> Boolean -> Basliyor mu ?
        System.out.println(text.startsWith("W"));

        // endsWith() -> Boolean -> Bitiyor mu ?
        System.out.println(text.endsWith("."));

        // getChars() -> String bir ifadenin istedigimiz bir kismindan baslayarak sectigimiz araligi yeni bir char array'e aktarabiliriz
        char[] charArray = new char[4];
        text.getChars(0,4,charArray,0);
        System.out.println(charArray);

        // indexOf() -> Girilen parametredeki karakterin index'ini bulmamizi saglar. İlk buldugu hedefi geri dondurur sonrasini aramaz
        System.out.println(text.indexOf("i"));

        // lastIndexOf() -> Aramaya sagdan baslar
        System.out.println(text.lastIndexOf("s"));

        // replace() -> String icerisindeki belli karakteri degistirmek icin kullanılır
        // Example: Sitelerin url'lerinde bosluk olmaması gerekmektedir.Url icerisindeki bosluklarin yerine - koymak icin kullanilabilir
        System.out.println(text.replace(' ','-'));
        System.out.print(text); // Atama yapilmadigi icin degisken icerigi kalici sekilde degismez

        // substring() -> Stringin bir kismini almamizi saglar
        // substring(baslangic,bitis) -> Baslangic dahil , bitis dahil degil
        System.out.println("\n"+text.substring(2,5));

        // split(ayrimin yapilacagi ifade) -> Sectigimiz karaktere gore stringi dizi elemanlari olarak ayirir
        System.out.println("SPLIT METHOD");
        for(String word : text.split(" ")){
            System.out.println(word);
        }
        // toLowerCase() -> Harfleri kucultur
        System.out.println(text.toLowerCase());

        // toUpperCase() -> Harfleri buyultur
        System.out.println(text.toUpperCase());

        // trim() -> ifadenin basindaki ve sonundaki boslukları kaldirir
        text = "     Weather is rainy    ";
        System.out.println(text.trim());
        System.out.println(text);


    }
}



