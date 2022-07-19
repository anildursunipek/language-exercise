import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap
        // Diger dillerde sozluk yapisi olarak gecmektedir
        // Key ve Value vardir
        // Liste uzerinde her bir eleman key value olarak 2 parcadan olusur
        // HashMap<KeyType,ValueType> hashMapName = new HashMap<KeyType,ValueType>();
        // Key ve value farkli tiplerde de olabilir
        // <String,String> , <int,int> , <int,String> , <String,int>
        HashMap<String,String> dictionary = new HashMap<String,String>();
        dictionary.put("Table","Masa"); // ArrayList'den arkli olarak add yerine put ile deger atiyoruz
        dictionary.put("Copmuter","Bilgisayar");
        dictionary.put("Mouse","Fare");
        dictionary.put("Software","Yazilim");

        System.out.println(dictionary.get("Table")); // ArrayList ile ayni sekilde get ile degerleri alabiliyoruz. Parametre olarak key giriyoruz
        dictionary.remove("Mouse"); // Remove islemini parametre olarak key'i girerek yapabiliriz
        System.out.println(dictionary); // Sozlukleri bu sekilde bastirabiliriz

        System.out.println("---- Values ----");
        for(String i:dictionary.values()){
            System.out.println(i);
        }
        System.out.println("---- Keys ----");
        for(String i:dictionary.keySet()){
            System.out.println(i);
        }
        // Key value birlikte dongu
        System.out.println("---- Key Value(items) ----");
        for(String item:dictionary.keySet()){
            System.out.println("Key: " + item + "  Value: " + dictionary.get(item));

        }
        System.out.println("Dictionary size -> " + dictionary.size()); // Eleman sayisini yazdirir -> 3
        dictionary.clear(); // Tum listeyi temizler
        System.out.println("Dictionary size -> " + dictionary.size());
    }
}