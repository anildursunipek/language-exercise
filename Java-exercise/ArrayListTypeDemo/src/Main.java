import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("New York");
        cities.add("Boston");
        cities.add("Istanbul");
        cities.add("Ankara");
        cities.add("Bursa");
        // Arraylist tip güvenli hale getirilebilir
        // Java, C# gibi dillerde bu tarz yapilarin tip guvenli olması onemlidir
        // ArrayList<type> listName = new ArrayList<type>(); -> Bu sekilde istedigimiz tipde bir ArrayList tanimlayabiliriz
        cities.remove("Boston"); // Onceki ornekten farkli olarak remove ile index silebildigimiz gibi silmek istedigimiz degeri de yazabiliriz
        Collections.sort(cities);
        // For each dongusunde artik object yerine belirledigimiz donguyu yaziyoruz
        for(String i:cities){
            System.out.println(i);
        }

    }
}